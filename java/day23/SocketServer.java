package day23;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class SocketServer{
    public static void main(String[] args) {
        try {
            //创建服务端对象  ----指定端口号
            ServerSocket server=new ServerSocket(9999);
            //等待  客户端链接  如果无人链接 一直处于等待
            //如果有客户端链接  就会返回客户端对象
            Socket s= server.accept();
            System.out.println(s.getInetAddress()+"链接成功");
            //通过对应的客户端对象获取的流 才可以读取和写入
            //对应客户端传递过来的数据
            InputStream is=s.getInputStream();
            OutputStream os=s.getOutputStream();
            InputStreamReader isr=new InputStreamReader(is);
            BufferedReader  br=new BufferedReader(isr);
            String mess="";
            while((mess=br.readLine())!=null){
                System.out.println("我是服务端,客户端传递的数据是:"+mess);
            }
            s.shutdownInput(); // 给客户端一个回忆 读取结束了
            os.write("我收到了你的信息,谢谢".getBytes());

            br.close();
            isr.close();
            is.close();
            os.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
