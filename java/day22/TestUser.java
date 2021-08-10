package day22;

import java.io.*;
import java.util.*;

//模拟XXX系统 注册和登录
public class TestUser {
    static Scanner sc=new Scanner(System.in);
    static List<User> list=new ArrayList<>(); //保存所有的用户信息
    static{
       //反序列化  读取list数据
        objectInput();
        for(User u:list){
            System.out.println(u);
        }
    }
    public static void main(String[] args) {
        System.out.println("*******欢迎进入XXXX系统******");
        System.out.println("1.注册");
        System.out.println("2.登录");
        System.out.println("*****************************");
        System.out.println("请输入您需要选择编号:");
        int n=sc.nextInt();
        if(n==1)  register() ;
        else if(n==2)  login() ;
        //...
        else if(n==3)  ;
        else if(n==4)  ;
    }
    public static void register(){
        System.out.println("请输入注册账号:");
        String un=sc.next();
        System.out.println("请输入注册密码:");
        String pw=sc.next();
        System.out.println("请再次输入密码:");
        String pw2=sc.next();
        if(pw.equals(pw2)){
            //id类似于学号  为了保证元素唯一的方式
            //如何保证元素唯一 随机
            //通过随机数、通过时间戳、UUID随机生成32位永不重复的字符串
            String id=UUID.randomUUID().toString();
            User u=new User(id,un,pw);
            list.add(u);
            //序列化保存list
            objectOutput();
        }else{
            System.out.println("您两次密码不一致");
        }
    }
    public static void login(){
        System.out.println("请输入您的账号:");
        String username=sc.next();
        System.out.println("请输入您的密码:");
        String password=sc.next();
        User user=null;
        for(User u:list){
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                user=u;
            }
        }
        if(user!=null){
            System.out.println("登录成功，账户信息如下:");
            System.out.println("id:"+user.getId());
            System.out.println("账号:"+user.getUsername());
            System.out.println("密码:"+user.getPassword());
            // 进入二级菜单   展示 修改 删除 ...
        }else{
            System.out.println("账号和密码有误!");
        }
    }
    //反序列化
    public static void objectInput(){
        FileInputStream fis=null;
        ObjectInputStream ois=null;

        try {
            fis=new FileInputStream("d://io//list.txt");
            ois=new ObjectInputStream(fis);
            list=(List<User>)ois.readObject(); //给外面的成员变量赋值
        }catch (FileNotFoundException e){
            System.out.println("第一次使用");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(ois!=null)ois.close();
                if(fis!=null)fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    //序列化
    public static void objectOutput(){
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            fos=new FileOutputStream("d://io//list.txt");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(oos!=null) oos.close();
                if(fos!=null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
