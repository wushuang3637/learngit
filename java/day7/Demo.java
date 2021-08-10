package day7;

public class Demo {
     int num;  //普通成员变量
    static int a; //静态变量  也叫类变量
    static int b; //静态变量  也叫类变量
    public static void test(){  //静态方法  也叫类方法
        System.out.println("test"+a);
        //num不是静态属性不能使用在静态方法中
        //System.out.println(num);
        //test2();  //方法不是静态的不能使用
    }

    public void test2(){
        //普通方法可以使用静态和普通 成员变量
        System.out.println(num);
        System.out.println(a);
        System.out.println(b);
        test();
    }


}
