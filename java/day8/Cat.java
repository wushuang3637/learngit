package day8;

public class Cat extends Pet {
    String sex;
    public void print(){
        System.out.println("猫的名字:"+name+",性别:" +
                ""+sex+",健康值:"+health+",友好度:"+love);
    }
    public void eat() {
        System.out.println("猫开始吃鱼,健康值加10，友好度加10");
        super.health+=10;
        super.love+=10;
    }
    public void hit() {
        System.out.println("猫开始被打，健康值减20，友好度减20");
        if(super.health>=20) super.health-=20;
        if(super.love>=20) super.love-=20;

        if(super.health==0) System.out.println("您的猫已经灭绝");
        if(super.love==0) System.out.println("您的猫已经对您深恶痛绝");
    }
}
