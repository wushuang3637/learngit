package day7;
// Dog类继承了Pet类
public class Dog extends Pet{
    String type;//品种
    public void print(){
        System.out.println("狗狗的名字:"+name+",品种:" +
                ""+type+",健康值:"+health+",友好度:"+love);
    }
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.fly();
    }
}
