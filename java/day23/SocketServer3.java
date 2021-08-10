package day23;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

//模拟多人聊天  群聊
//原理:  通过客户端 发送消息到服务端
//在通过服务端 将消息 发送给其他客户端
//服务端 起到中介 中转的作用
public class SocketServer3 {
    //创建聊天室  进群  用于保存所有进入群的人员
    static List<Socket> list=new ArrayList<>();
    public static void main(String[] args) {
        try {
            ServerSocket server=new ServerSocket(1234);
            System.out.println("***聊天室开启成功***");
            while(true){
                Socket client=server.accept();
                list.add(client);
                //每个客户端 获取和发送数据的逻辑  每个人都不同 线程
                new Thread(new ServerThread3(client)).start();
            }
        } catch (IOException e) {
          //  e.printStackTrace();
        }
    }
}
class ServerThread3 implements Runnable{
    Socket s;
    public ServerThread3(Socket s){
        this.s=s;
    }
    @Override
    public void run() {
        System.out.println(s.getInetAddress()+"进去群聊");
        try {
            InputStream is=s.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            while(true){
                String clientMess=br.readLine();
                System.out.println(clientMess);
                //写入其他客户端
                for (Socket client:SocketServer3.list){
                    if(!client.equals(s)){ //排除自己的socket对象
                        OutputStream os=client.getOutputStream();
                        os.write((clientMess+"\n").getBytes());
                        //字节流和字符流（输入 输出 都是存在缓存）
                        os.flush();
                    }
                }
            }
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }
}
