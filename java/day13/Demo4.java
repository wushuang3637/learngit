package day13;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        try{
            Scanner sc=null;
            System.out.println("请输入第一个数:");
            int num = sc.nextInt();
            System.out.println("请输入第二个数:");
            int num2=sc.nextInt();
            double result=num/num2;
            System.out.println("结果是:"+result);
        }catch (ArithmeticException a){  //捕获除数不能为0
            //a.printStackTrace();
            System.err.println("除数不能为0");
        }catch (NullPointerException n){//捕获空指针异常
            System.err.println("出现了空指针异常");
        }catch (Exception e){

        }
        System.out.println("111111");
        System.out.println("111111");
        System.out.println("111111");
        System.out.println("111111");
        System.out.println("111111");
        System.out.println("111111");
    }
}
