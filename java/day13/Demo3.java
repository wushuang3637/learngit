package day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
    public void login() throws ParseException{
        String username="admin";
        String password="123";
        String time="55345345435";
        Date hireDate=new SimpleDateFormat("yyyy-MM-dd").parse(time);
    }
    public void show()throws ParseException{
        login();
    }
    public void delete(){
        try{
            show();
        }catch (ParseException p){
            System.out.println(p.getMessage());// 获取异常名称
            p.printStackTrace();  //打印异常堆栈信息  异常出现的过程
            System.err.println("错误信息");
        }
    }
    public static void main(String[] args){
        new Demo3().delete();
    }
}
