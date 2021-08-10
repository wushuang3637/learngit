package day22;

import java.io.*;
import java.util.Scanner;

public class TestStreamReader {
    public static void main(String[] args) throws IOException {
       InputStream is=System.in;//系统输入   可以通过控制台手动输入内容
       is=new FileInputStream("D://io//java//a.txt");
        //传入字节流 生成一个字符流  InputStreamReader
       InputStreamReader isr=new InputStreamReader(is);
       BufferedReader br=new BufferedReader(isr);
       String mess=br.readLine();
       //new Scanner(System.in).nextLine();
       System.out.println(mess);

       FileOutputStream fos=new FileOutputStream("d://io//out.txt");
       OutputStreamWriter osw=new OutputStreamWriter(fos);
       BufferedWriter bw=new BufferedWriter(osw);
       bw.write("我是一个字符流");
       bw.write("我很牛逼");
       bw.newLine();  //换行
       bw.write("下一行数据");
       bw.close();
       osw.close();
       fos.close();

    }
}
