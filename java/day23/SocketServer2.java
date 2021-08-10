package day23;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Socket传递对象
public class SocketServer2 {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9999);
            while(true) {
                Socket client = server.accept();
                //一个Socket对象 就是一个客户端  多个客户端会出现多个Socket
                //但是服务端只有一个
                new Thread(new ClientThread2(client)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
class ClientThread2 implements  Runnable{
    //不同客户端 运行的逻辑
    Socket  s;
    public ClientThread2(Socket s){
        this.s=s;
    }
    @Override
    public void run() {
        try {
            //创建输入输出读写数据  （String ，对象）
            InputStream is=s.getInputStream();
            OutputStream os=s.getOutputStream();
            //客户端已经到服务端了一个对象
            ObjectInputStream  ois=new ObjectInputStream(is);
            User user=(User)ois.readObject();
            System.out.println("我是服务端,客户端传递的对象是:"+user);
            s.shutdownInput();
            os.write("我是老王，你的对象收到了".getBytes());
            ois.close();
            is.close();
            os.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}