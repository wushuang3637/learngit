package day7;
//宠物类    共有属性单独提出来
public abstract class Pet  extends  Animal{
    String name;
    int love=50;
    int health=50;
    //方法 如果只有声明  没有方法实现  称之为抽象方法
    //abstract  修饰的方法 叫抽象方法
    //如果类中有抽象方法  那么这个类一定是抽象类
    public abstract void print();
}
class Animal{
    public void eat(){

    }
    public void fly(){

    }
}
