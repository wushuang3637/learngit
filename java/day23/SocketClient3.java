package day23;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient3 {
    public static void main(String[] args) {
        System.out.println("进入群聊:输入exit退出");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的名字:");
        String name=sc.next();


        try {
            Socket client =new Socket("192.168.0.89",1234);
            // 获取手动输入您要发送的消息  输入流  System.in
            // 把写好的消息写入给服务端  输出流
            // 接受服务器返回来的数据  输入流
            //client.getInputStream()==>InputStream 这个流 只能用读取服务端数据
            InputStream is=System.in;// 系统输入
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            OutputStream os=client.getOutputStream();
            //读取服务器返回的数据   可以自己单独开个线程
            new Thread(new ClientThread3(client)).start();
            //br.readLine();// 可以读取出来  控制台手动输入的数据
            while(true){
                String mess=br.readLine();  //手动输入的数据
                if(mess.equals("exit")){
                    os.write((name+"退群了\n").getBytes());
                    break;
                }else{
                    os.write((name+"说:"+mess+"\n").getBytes());
                }
                os.flush();
            }
            System.out.println("已经退群");
            SocketServer3.list.remove(client);  //把集合中的客户端删除
        } catch (IOException e) {
           //e.printStackTrace();
        }
    }
}
class ClientThread3 implements  Runnable{
    //只是当前客户端 接受到了服务端数据
    Socket s;
    public ClientThread3(Socket s){
        this.s=s;
    }
    @Override
    public void run() {
        try {
            InputStream is=s.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            while(true) {
                String serverMess = br.readLine();  //读取服务端的数据
                System.out.println(serverMess);
            }
        } catch (IOException e) {
           // e.printStackTrace();
        }
    }
}
