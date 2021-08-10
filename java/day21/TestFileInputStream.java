package day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {
    public static void main(String[] args) {
        //1.创建对象  FileInputStream
        try {
            //FileInputStream fis=new FileInputStream("d://abc//java.txt");
            File f=new File("d://abc//java.txt");
            FileInputStream fis=new FileInputStream(f);
            //每调用一次 表示读取一个字节 返回值是int 类型 是字节转换的ascii码
//            char c=(char)fis.read();
//            int i=fis.read();
//            System.out.println(c+" "+i);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
