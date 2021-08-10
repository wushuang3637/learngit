package day23;

import java.io.*;
import java.net.Socket;

//客户端
//ip地址 192.168.0.XXX  如果本机:localhost /127.0.0.1
public class SocketClient {
    public static void main(String[] args) {
        try {
            //创建客户端对象----ip+端口
            Socket client=new Socket("192.168.0.83",9999);
            InputStream is=client.getInputStream();
            OutputStream os=client.getOutputStream();
            String mess="我是老王 我在隔壁";
            os.write(mess.getBytes());
            client.shutdownOutput(); //给服务器一个回应  写入结束
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            mess="";
            while((mess=br.readLine())!=null){
                System.out.println("我是客户端,服务端传递的数据是:"+mess);
            }
            br.close();
            os.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
