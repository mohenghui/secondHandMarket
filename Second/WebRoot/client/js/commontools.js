/**
 * Created by ideabobo on 14-6-28.
 * commontools
 */
serializeObject = function(form) {
    var o = {};
    $.each(form.serializeArray(), function(index) {
        if (o[this['name']]) {
            o[this['name']] = o[this['name']] + "," + this['value'];
        } else {
            o[this['name']] = this['value'];
        }
    });
    return o;
};

function ajaxCallback(action, data, cb,notshow) {
    if(!clientUrl){
        alert("请先设置服务端根路径");
        return;
    }
    !notshow && showLoader("请稍后...");
    data = data || {};
    var retrytimes = 5;
    var count = 0;
    var connectServer = function(){
        !notshow && showLoader("请稍后...");
        $.ajax({
            type: "GET",
            url: clientUrl + action,
            dataType: "jsonp",
            jsonp: "callback",
            contentType: "text/html; charset=utf-8",
            data: data,
            timeout:50000,
            async:true,
            success: function (data) {
                hideLoader();
                cb(data);
                console.log("success");
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                hideLoader();
                console.log("error:"+XMLHttpRequest+" textStatus:"+textStatus+" errorThrown"+errorThrown);
            },
            complete:function(XMLHttpRequest, textStatus){
                console.log("complete:"+XMLHttpRequest+"textStatus:"+textStatus);
                if(textStatus == "timeout"){
                    if(count<retrytimes){
                        count++;
                        connectServer();
                        console.log(count);
                    }else{
                        showLoader("连接服务器超时！",true);
                    }

                }
            }
        });
    };
    connectServer();
}
/**
 * 判断是否所有的属性都有值
 * @param obj
 * @returns {boolean}
 */
function checkObjectValue(obj) {
    for(var p in obj){
        if(obj[p]!=undefined && obj[p]!=null){
            if($.trim(obj[p]) == ""){
                return true;
            }
        }
    }
    return false;
}

function getObjectById(id,goodlist){
    for(var i=0;i<goodlist.length;i++){
        var good = goodlist[i];
        if(good.id == id){
            return good;
        }
    }
    return null;
}

function createCode(len) {
    var seed = new Array(
        'abcdefghijklmnopqrstuvwxyz',
        'ABCDEFGHIJKLMNOPQRSTUVWXYZ',
        '0123456789'
    );               //创建需要的数据数组
    var idx,i;
    var result = '';   //返回的结果变量
    for (i=0; i<len; i++) //根据指定的长度
    {
        idx = Math.floor(Math.random()*3); //获得随机数据的整数部分-获取一个随机整数
        result += seed[idx].substr(Math.floor(Math.random()*(seed[idx].length)), 1);//根据随机数获取数据中一个值
    }
    _yanzhengma = result;
    return result; //返回随机结果
}

function clickYanzhengma(){
    $("#yanzhengmalabel").text("验证码:"+createCode(5));
}











var scrolls = {};

function setScroll(type, wapper) {
    if (scrolls[type]) {
        scrolls[type].refresh();
    } else {
        scrolls[type] = new IScroll(wapper, {
            snap: false,
            bounceTime: 300,
            fadeScrollbars: true,
            mouseWheel: true,
            click: true
        });
    }

    return scrolls[type];
}

function setHScroll(type, wapper) {
    if (scrolls[type]) {
        scrolls[type].refresh();
    } else {
        scrolls[type] = new IScroll(wapper, {scrollX: true, scrollY: false});
    }
    return scrolls[type];
}


function getFileType(str){
    var index=str.lastIndexOf('.');
    var strtype=str.substr(index,4);
    strtype=strtype.toLowerCase();
    return strtype;
}




var _showimgel = null;

function getFileInput(el){
    var el = $(el).prev();
    _showimgel = el;
    document.getElementById('selectimginput').click();

}
function showPicImg(files){
    var reader = new FileReader();
    reader.readAsDataURL(files[0]);
    reader.onload = function(e){ // reader onload start
        $(_showimgel).attr("src", e.target.result);
    }
}

/*
function ajaxFormUploadFile(cb){
    $("#uploadForm" ).ajaxForm({
        url : uploadUrl,
        type:"post",
        beforeSubmit: function(){
            return true;
        },
        success : function(r){
            $("#uploadForm" )[0].reset();
            cb && cb(r);
        },
        xhr: function() {
            var xhr = $.ajaxSettings.xhr();
            //绑定上传进度的回调函数
            xhr.upload.addEventListener('progress', function(e){
                var totalsize = e.totalSize;
                var currentsize = e.position;
                var percent = parseInt((currentsize/totalsize)*100);
                showLoader("正在上传图片 "+percent+"%...");
            }, false);
            return xhr;//一定要返回，不然jQ没有XHR对象用了
        },
        resetForm:false
    }).submit();
}
*/


function ajaxFormUploadFile(cb){
    var formData = new FormData($("#uploadForm")[0]);
    $.ajax({
        url: uploadUrl ,  /*这是处理文件上传的servlet*/
        type: 'POST',
        data: formData,
        async: false,
        cache: false,
        contentType: false,
        processData: false,
        success: function (r) {
            cb && cb(r);
        },
        error: function (r) {
            cb && cb("");
        }
    });
}

