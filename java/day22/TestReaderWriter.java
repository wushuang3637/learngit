package day22;

import java.io.*;

public class TestReaderWriter {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("d://io//java//a.txt");
        FileWriter fw=new FileWriter("d://io//a.txt");
//        char[] ch=new char[1024];
//        int len=0;
//        while((len=fr.read(ch))!=-1){
//            fw.write(ch,0,len);
//        }

        BufferedReader br=new BufferedReader(fr);
        BufferedWriter bw=new BufferedWriter(fw);
        String mess="";
        //可以通过缓冲流的方法直接读取一整行数据  返回字符串
        while((mess=br.readLine())!=null){
            bw.write(mess);
        }
        // 如果使用了缓冲流 由于借用了缓冲区(内存) 作为中间站
        //  数据最开始没有写入到本地文件中去  所以写入的文件看不到数据
        //  所以需要三种方案可以解决:
        // 1. 缓冲区存储满了
       //  2. 可以手动清空缓冲  bw.flush();
        // 3. 关闭资源   也会把缓冲区内容写入到本地文本
        // br.close()
        // bw.close()
//        fr.close();
//        fw.close();
//        控制台程序
//        jsp+servlet
//
//                ssm
//                        sprintboot+mybaits
//                                分布式
        InputStream is=System.in;
        OutputStream os=System.out;
    }
}
