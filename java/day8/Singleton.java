package day8;
/*单例步骤:1. 构造方法私有化
2.对外提供公共方法返回一个对象*/
public class Singleton {
    private Singleton(){}
    //1.饿汉式
    //private static Singleton s=new Singleton();
    //2.懒汉式 （会有隐患 出现并发 通过同步锁防止隐患）
    private static Singleton s;
    public static Singleton getSingleion(){
       if(s==null) s=new Singleton();
        return s;
    }
}
class TestSingleton{
    public static void main(String[] args) {
        Singleton s1=Singleton.getSingleion();
        Singleton s2=Singleton.getSingleion();
        Singleton s3=Singleton.getSingleion();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
