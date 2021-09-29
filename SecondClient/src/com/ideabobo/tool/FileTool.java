package com.ideabobo.tool;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;

public class FileTool extends AsyncTask<String, Void, Integer>{
	private static final String COMMAND_BACKUP = "backupDatabase";
    public static final String COMMAND_RESTORE = "restroeDatabase";
    private Context mContext;

    public FileTool(Context context) {
        this.mContext = context;
    }

    @Override
    public Integer doInBackground(String... params) {
        // TODO Auto-generated method stub
    	// 获得正在使用的数据库路径，我的是 sdcard 目录下的 /dlion/db_dlion.db
    	 // 默认路径是 /data/data/(包名)/databases/*.db
//        File dbFile = mContext.getDatabasePath(Environment
//                .getExternalStorageDirectory().getAbsolutePath()
//                + "/dlion/db_dlion.db");
        File dbFileDir = mContext.getDatabasePath("/data/data/com.ideabobo.gap/");
        File exportDir = new File(Environment.getExternalStorageDirectory(),
                "ideaback/");
        if (!exportDir.exists()) {
            exportDir.mkdirs();
        }
        String command = params[0];
        if (command.equals(COMMAND_BACKUP)) {
            try {
                copyDirectiory(dbFileDir.getAbsolutePath(), exportDir.getAbsolutePath());
                return Log.d("backup", "ok");
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
                return Log.d("backup", "fail");
            }
        } else if (command.equals(COMMAND_RESTORE)) {
            try {
            	copyDirectiory(exportDir.getAbsolutePath(), dbFileDir.getAbsolutePath());
                return Log.d("restore", "success");
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
                return Log.d("restore", "fail");
            }
        } else {
            return null;
        }
    }

    private void fileCopy(File dbFile, File backup) throws IOException {
        // TODO Auto-generated method stub
        FileChannel inChannel = new FileInputStream(dbFile).getChannel();
        FileChannel outChannel = new FileOutputStream(backup).getChannel();
        try {
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (inChannel != null) {
                inChannel.close();
            }
            if (outChannel != null) {
                outChannel.close();
            }
        }
    }
    
    // 复制文件夹
    public static void copyDirectiory(String sourceDir, String targetDir) throws IOException {
        // 新建目标目录
        (new File(targetDir)).mkdirs();
        // 获取源文件夹当前下的文件或目录
        File[] file = (new File(sourceDir)).listFiles();
        for (int i = 0; i < file.length; i++) {
            if (file[i].isFile()) {
                // 源文件
                File sourceFile = file[i];
                // 目标文件
                File targetFile = new File(new File(targetDir).getAbsolutePath() + File.separator + file[i].getName());
                copyFile(sourceFile, targetFile);
            }
            else if (file[i].isDirectory()) {
                // 准备复制的源文件夹
                String dir1 = sourceDir + "/" + file[i].getName();
                // 准备复制的目标文件夹
                String dir2 = targetDir + "/" + file[i].getName();
                copyDirectiory(dir1, dir2);
            }
        }
    }

    // 复制文件
    public static void copyFile(File sourceFile, File targetFile) throws IOException {
        BufferedInputStream inBuff = null;
        BufferedOutputStream outBuff = null;
        try {
            // 新建文件输入流并对它进行缓冲
            inBuff = new BufferedInputStream(new FileInputStream(sourceFile));

            // 新建文件输出流并对它进行缓冲
            outBuff = new BufferedOutputStream(new FileOutputStream(targetFile));

            // 缓冲数组
            byte[] b = new byte[1024 * 5];
            int len;
            while ((len = inBuff.read(b)) != -1) {
                outBuff.write(b, 0, len);
            }
            // 刷新此缓冲的输出流
            outBuff.flush();
        } finally {
            // 关闭流
            if (inBuff != null)
                inBuff.close();
            if (outBuff != null)
                outBuff.close();
        }
    }
    
    public static void delFolder(String folderPath) {
        try {
           delAllFile(folderPath); //删除完里面所有内容
           String filePath = folderPath;
           filePath = filePath.toString();
           java.io.File myFilePath = new java.io.File(filePath);
           myFilePath.delete(); //删除空文件夹
        } catch (Exception e) {
          e.printStackTrace(); 
        }
   }
   
  //删除指定文件夹下所有文件
   //param path 文件夹完整绝对路径
      public static boolean delAllFile(String path) {
          boolean flag = false;
          File file = new File(path);
          if (!file.exists()) {
            return flag;
          }
          if (!file.isDirectory()) {
            return flag;
          }
          String[] tempList = file.list();
          File temp = null;
          for (int i = 0; i < tempList.length; i++) {
             if (path.endsWith(File.separator)) {
                temp = new File(path + tempList[i]);
             } else {
                 temp = new File(path + File.separator + tempList[i]);
             }
             if (temp.isFile()) {
                temp.delete();
             }
             else if (temp.isDirectory()) {
                delAllFile(path + "/" + tempList[i]);//先删除文件夹里面的文件
                delFolder(path + "/" + tempList[i]);//再删除空文件夹
                flag = true;
             }
          }
          return flag;
        }
      
      public static String getSDPath(){ 
          File sdDir = null; 
          boolean sdCardExist = Environment.getExternalStorageState()   
                              .equals(android.os.Environment.MEDIA_MOUNTED);   //判断sd卡是否存在 
          if(sdCardExist){                               
            sdDir = Environment.getExternalStorageDirectory();//获取跟目录 
          }   
          return sdDir.toString();   
      }
}
