package day8;
//定义一个接口  通过interface表示接口
public interface InterDemo {
    //内部包含了 默认三个修饰符public static final
    String A="str";
    public static final long SERID=435435345354435L;
    //在接口中  abstract 修饰符可以省略
    public abstract void test();
    public  void test2();
    //jdk1.8 之后 支持默认方法   静态方法  可以写实现部分
    public default void sleep(){
        System.out.println("开始睡觉");
    }
    public static void sleep2(){

    }
    //不能写构造方法
    //public InterDemo(){}

}
interface interDemo2{
    public void run();
}
//支持 接口和接口之间 支持多继承     可以继承多个直接父类
interface interDemo3 extends interDemo2,InterDemo{
    public void speed();
}
//类和接口之间 支持多实现
class testInterface implements interDemo3,interDemo2,InterDemo {
    public void speed(){ }
    public void run(){}
    public void test(){}
    public void test2(){}

    public static void main(String[] args) {
        // 父类引用指定了子类对象
        InterDemo td=new testInterface();
        td.test();
        td.test2();
        td.sleep();

    }
}
