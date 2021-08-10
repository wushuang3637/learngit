package day13;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的性别:(男、女)");
        String sex=sc.next();
        if(!sex.equals("男")&&!sex.equals("女")){
            //性别输入有误
            try {
                throw new SexException("性别只能是男或者女");
                //throw new Exception("性别只能是男或者女");
            }catch (SexException s){
                System.out.println(s.getMessage());
               // s.printStackTrace();
            }catch (Exception e){

            }

            try {
                throw new Exception("性别只能是男或者女");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
