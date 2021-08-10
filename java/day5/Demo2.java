package day5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        //请输入两个数   请输入运算符号
        // 实现一个四则运算(通过类和对象)
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int num1=sc.nextInt();
        System.out.println("请输入第二个数:");
        int num2=sc.nextInt();
        System.out.println("请输入运算符号(1.+  2.-  3.*  4./)");
        int n=sc.nextInt();
        Calculator cal=new Calculator(); //计算器对象
        //给属性赋值
        cal.setNum1(num1);
        cal.setNum2(num2);
        double result=0;
        switch (n){
            case 1: result=cal.jia(); break;
            case 2: result=cal.jian();break;
            case 3: result=cal.cheng();break;
            case 4: result=cal.chu();break;
        }
        if(result==000000)System.out.println("运算出错，除数不能为0");
        else System.out.println("结果是:"+result);
        int a=10;
        switch(a){
            case 1: break;
            case 2: String abc="123"; break;
            case 3:
                abc="123";break;
            case 4: break;
        }
        //abc="111";
    }
}
