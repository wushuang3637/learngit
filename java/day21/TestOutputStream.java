package day21;

import org.junit.Test;

import java.io.*;
import java.text.DecimalFormat;

public class TestOutputStream {
    @Test
    public void test1(){
        FileOutputStream fos=null;
        try {
            //创建输出流:  如果文件不存在会帮你自己创建
            // 如果父级目录不存在 会出现异常 文件找不到异常
            String path="d://abc//io";
            File f=new File(path);
            if(!f.exists()){
                f.mkdirs();
                System.out.println("第一创建");
            }
            // 参数2: 默认值是false 每次写入文件 都是清空原来的内容
            //true: 每次写入文件 都是在原来内容基础上 追加内容
            fos=new FileOutputStream(path+"//output.txt",true);
            //字节转换的ASCII
//            fos.write(97);
//            fos.write(65);
            //byte[] ==>String    new String(字节数组)
            //String==>byte[]
            //"".getBytes()
            //String==>char[]
            //"".toCharArray()
            fos.write("你好我是老王，我住你隔壁".getBytes("utf-8"));
            fos.write("我下班比较早".getBytes("utf-8"));
            //ctrl+C   V  复制粘贴   IO 读写
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
               if(fos!=null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    //文件复制  从一个文件内容读取出来 需要输入流
    //再写入到另外一个文件  需要输出流
    public void copy(){
        FileInputStream fis=null;
        FileOutputStream fos=null;

        try {
            long begin=System.currentTimeMillis();
            File f=new File("d://abc//dw.rar");
            fis=new FileInputStream(f);
            fos=new FileOutputStream("d://abc//io//newDw.rar");
            long sum=f.length();  //文件总共字节数
            byte[] b=new byte[1024];
            int len=0;
            long append=0;  //目前读取的字节累加的数量
            int n=1;
            while((len=fis.read(b))!=-1){
                fos.write(b,0,len);
                append+=len;
                long end=System.currentTimeMillis();
                if(append>=(sum/10*n)){
                    n++;
                    DecimalFormat df=new DecimalFormat("00.00");
                    String result=df.format((append/(sum*1.0))*100);
                    System.out.println("目前复制了"+result+"%,所花时间"+(end-begin)+"毫秒");
                }
            }
            long end=System.currentTimeMillis();
            System.out.println("复制成功: 所花时间:"+(end-begin)+"毫秒");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
             if(fis!=null)   fis.close();
             if(fos!=null)   fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
