package day8;
//宠物类    共有属性单独提出来
public abstract class Pet{
    String name;
    int love=50;
    int health=50;
    //方法 如果只有声明  没有方法实现  称之为抽象方法
    //abstract  修饰的方法 叫抽象方法
    //如果类中有抽象方法  那么这个类一定是抽象类
    //private 和abstract 不可以同时 使用
    protected abstract void print();
    public abstract void eat();
    public abstract void hit();
}

class Animal{
    public void eat(){

    }
    public void fly(){

    }
}
