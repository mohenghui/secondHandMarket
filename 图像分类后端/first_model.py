#encoding=utf-8
import os
os.environ['CUDA_VISIBLE_DEVICES']='1'
from flask import Flask, render_template, request, url_for
import cv2
import numpy as np
import re
import base64
from tensorflow.keras.models import load_model
from PIL import Image
import matplotlib.pyplot as plt
from datetime import timedelta
# 读取图片
def get_img(file_path, img_rows, img_cols):
    img = cv2.imread(file_path)
    img = cv2.resize(img, (img_rows, img_cols))
    # 单通道
    if img.shape[2] == 1:
        img = np.dstack([img, img, img])
    else:
        img = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)
    img = img.astype(np.float32)/ 255.0
    img=(img - 0.5) * 2
    img = np.expand_dims(img, axis=0)
    return img

label_name=['空调','篮球','饮料','望远镜','书籍','收音机','计算器',
            '键盘','电脑屏幕','鼠标','化妆品','哑铃','电筒','足球',
            '胶棒','耳机','笔','手机','冰箱','剪刀','衣服','鞋子',
            '零食','玩具','投影仪','洗衣机']
# 1. 初始化 flask app
# 强制性的
app = Flask(__name__)
# app.config['DEBUG']=True
# app.config['SEND_FILE_MAX_AGE_DEFAULT']=timedelta(seconds=1)
# 2. 初始化global variables
# sess = tf.Session()
# graph = tf.get_default_graph()

# 3. 将用户画的图输出成output.png
def convertImage(imgData1):
  imgstr = re.search(r'base64,(.*)', str(imgData1)).group(1)
  # file_obj = request.files.get("pic")
  with open('output.png', 'wb') as output:
    output.write(base64.b64decode(imgstr))

# 4. 搭建前端框架
# 装饰器，那个url调用相关的函数
@app.route('/')
def index():
  return render_template("index.html")

@app.context_processor
def override_url_for():
    return dict(url_for=dated_url_for)

def dated_url_for(endpoint, **values):
    if endpoint == 'static':
        filename = values.get('filename', None)
    if filename:
        file_path = os.path.join(app.root_path, endpoint, filename)
        values['q'] = int(os.stat(file_path).st_mtime)
        return url_for(endpoint, **values)

# 5. 定义预测函数
@app.route('/predict/', methods=['GET', 'POST'])
def predict():
  # 这个函数会在用户点击‘predict’按钮时触发
  # 会将输出的output.png放入模型中进行预测
  # 同时在页面上输出预测结果
  imgData = request.get_data()
  # file_obj = request.files.get("pic")
  convertImage(imgData)
  # 读取图片
  predict_img=get_img('output.png',224,224)
  # 加载模型
  model = load_model('model/mB2_attention_v2.hdf5')
  predict = model.predict(predict_img)
  predict = np.argmax(predict, axis=1)
  print(str(label_name[predict[0]]))
  return str(label_name[predict[0]])

# 6. 返回本地访问地址
if __name__ == "__main__":
    # 让app在本地运行，定义了host和port
    # app.run(host='0.0.0.0', port=5000)
    app.run(host='0.0.0.0', port=8081)