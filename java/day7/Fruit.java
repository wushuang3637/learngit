package day7;
//（abstract 类似于告诉其他人代码没有写完）
public abstract class Fruit {
    //果汁方法
    public abstract void juice();
    public abstract void buy();
}
 class Apple extends Fruit{
    public void juice(){
        System.out.println("苹果汁");
    }
    public  void buy(){
    }
}
abstract class Orange extends Fruit{

}
