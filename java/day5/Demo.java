package day5;

public class Demo {
    public static void main(String[] args) {
        //想使用类中的资源 需要先创建对象
        //类名  对象名=new 类名();
        Dog  d=new Dog();
        //d.age=-100;   //没有权限
        d.setAge(50);
        System.out.println(d.getAge());
        d.print();
    }
}
