package day8;

// Dog类继承了Pet类
public class Dog extends Pet {
    String type;//品种
    protected void print(){
        System.out.println("狗狗的名字:"+name+",品种:" +
                ""+type+",健康值:"+health+",友好度:"+love);
    }
    public void eat() {
        System.out.println("狗开始吃骨头,健康值加10，友好度加10");
        if(super.health<=90) super.health+=10;
        if(super.love<=90) super.love+=10;
    }
    public void hit() {
        System.out.println("狗狗开始被打，健康值减20，友好度减20");
        if(super.health>=20) super.health-=20;
        if(super.love>=20) super.love-=20;

        if(super.health==0) System.out.println("您的狗狗已经灭绝");
        if(super.love==0) System.out.println("您的狗狗已经对您深恶痛绝");
    }

    public static void main(String[] args) {
        Dog d=new Dog();
//        d.eat();
//        d.fly();
    }
}
