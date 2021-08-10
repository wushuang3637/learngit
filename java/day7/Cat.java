package day7;

public class Cat extends Pet{
    String sex;
    public void print(){
        System.out.println("猫的名字:"+name+",性别:" +
                ""+sex+",健康值:"+health+",友好度:"+love);
    }
}
