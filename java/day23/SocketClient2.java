package day23;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient2 {
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            String un=sc.next();
            String pw=sc.next();
            Socket client=new Socket("192.168.0.89",9999);
            InputStream is=client.getInputStream();
            OutputStream os=client.getOutputStream(); //通过流写入到服务端一个对象
            ObjectOutputStream oos=new ObjectOutputStream(os);
            User u=new User("10",un,pw);
            oos.writeObject(u);
            client.shutdownOutput();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String mess="";
            while((mess=br.readLine())!=null){
                System.out.println("客户端接受的数据:"+mess);
            }
            br.close();
            os.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
