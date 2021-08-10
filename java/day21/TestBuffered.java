package day21;

import java.io.*;

public class TestBuffered {
    public static void main(String[] args) throws IOException {
        long begin=System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("d://abc//dw.rar");
        FileOutputStream fos=new FileOutputStream("d://abc//io//dw3.0.rar");
        //缓冲流:属于处理流
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        byte[] b=new byte[1024];
        int len=0;
        while((len=bis.read(b))!=-1){
            bos.write(b,0,len);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制成功:一共花了"+(end-begin)+"毫秒");
        bis.close();
        bos.close();
        fis.close();
        fos.close();

    }
}
