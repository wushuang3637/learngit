package day21;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class TestInputStream2 {
    @Test
    public void test1(){
        FileInputStream fis=null;
        try {
            //创建流对象
            File f=new File("d://abc//java.txt");
            fis=new FileInputStream(f);
            //读取  写入 数据
//            for(int i=0;i<f.length();i++){
//                //每调用一次 读取一个字节 返回字节转换ASCII码
//                System.out.print(fis.read());
//            }

//            byte[] b=new byte[10];
            //每次读取的是 数组长度的字节  并且把读取的内容存入数组
//            fis.read(b);
//            String mess=new String(b);
//            System.out.println(mess);
//            //读取中文会出现乱码  由于中文 有的3个字节 2个字节
//            //读取的第一次或者第二次会可能吧中文拆成2部分读取
//            fis.read(b);
//            mess=new String(b);
//            System.out.println(mess);

              byte[] b=new byte[10];
              int len=0;
              String str="s";
              boolean bb=str.equals("s");
              while((len=fis.read(b))!=-1){
                  // 返回值是 读取的内容长度  如果读取不到数据返回 -1
                  //把数组转字符串   还可以指定下标 和长度
                  String mess=new String(b,0,len);
                  //  参数4:编码方式
                  //String mess2=new String(b,0,len,"utf-8");
                  //把数组转字符串
                  //String mess=new String(b);
                  System.out.println(mess);
              }
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //读取结束了  还要释放资源
            try {
              if(fis!=null)  fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
