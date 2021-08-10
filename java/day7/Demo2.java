package day7;
import  java.util.Scanner;  //常规的导入包的方式
//如果想导入静态资源(属性,方法)  只能使用静态导入
import static day7.Demo.test;
import static day7.Demo.a;
import static day7.Demo.b;
public class Demo2 {
    public static void main(String[] args) {
//        System.out.println(a+" "+b);
//        test();  //表示在当前类 找不到 test() 静态方法
//
//
//        Demo d=new Demo();
//        d.test();
//        Demo.test();
//
//
//        d.num=100;  //普通成员变量  每个对象都是独立的
//        d.a=10000;  //静态变量  其他对象的静态变量  都是公用的
//        Demo d2=new Demo();
//        d2.num=1000;
//        System.out.println(d.num+" "+d2.num); //100 1000
//        System.out.println(d.a+" "+d2.a);//10000 10000
//        System.out.println(Demo.a);//通过类名调用
//        d2.a=1000;
//        System.out.println(d.a+" "+d2.a);//1000 1000
//        Demo.test();
//        d.test();
//        System.out.println(new Demo().a);
//        System.out.println(new Demo().a);
//        System.out.println(new Demo().a);
//        System.out.println(new Demo().a);
//        System.out.println(new Demo().a);
//        System.out.println(new Demo().a);
         Level newPerson=Demo3.levels[5];
        Level newPerson2=Demo3.levels[4];
        Level newPerson3=Demo3.levels[4];
        Level newPerson4=Demo3.levels[3];



    }
}
