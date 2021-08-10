package day9;

import java.util.Scanner;

public interface Compute {
    public int computer(int n,int m);

    public static void userCompute(Compute com,int n,int m){
        com.computer(n,m);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("第一个数:");
        int num1=sc.nextInt();
        System.out.println("第二个数:");
        int num2=sc.nextInt();
        System.out.println("请输入运算符号1+  2-  3*   4/");
        int n=sc.nextInt();
        //1..继承   2.重写方法  3. 父类引用指向子类对象
        Compute com=null;
        switch(n){
            case 1: com=new Jia();break;
            case 2: com=new Jian();break;
            case 3: com=new Jia();break;
            case 4: com=new Jia();break;
        }
        com.computer(num1,num2);
    }
}
class Jia implements Compute{
    public int computer(int n, int m) {
        return n+m;
    }
}
class Jian implements Compute{
    public int computer(int n, int m) {
        return n-m;
    }
}
