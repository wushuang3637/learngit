package day9;
/* 定义一个类   保证他只能创建出11个对象*/
public class Homework1 {
    private Homework1(){}
    static int count=0;
    static Homework1 h=null;
    public static  Homework1 getInstance(){
        if(count<11) {
            count++;
            h= new Homework1();
        }
        return h;
    }
}
class test{
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<20;i++){
            Homework1 h=Homework1.getInstance();
            System.out.println(h);
            //模拟1秒延迟
            Thread.sleep(1000);
        }
    }
}
class test2{
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<20;i++){
            Homework1 h=Homework1.getInstance();
            System.out.println(h);
            //模拟1秒延迟
            Thread.sleep(2000);
        }
    }
}
