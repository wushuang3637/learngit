package day10;

import java.util.Arrays;
import java.util.Scanner;

/*编写一个方法将String字符串进行反转*/
public class HomeWork {
    //实现字符串反转 返回值 是反转后的结果
    public static String reverse(String str){  //str="123abc123"
        String newString="";
        for(int i=0;i<str.length();i++){
            newString=str.charAt(i)+newString;
        }
        //增强型String
        return newString;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str=sc.next();   //111a111
        String newString=reverse(str);
        System.out.println("反转后是:"+newString);
        if(str.equals(newString)){
            System.out.println("字符串是对称的");
        }

    }
}
