package day8;

import java.util.Scanner;

//主人类
public class Person {
    //主人给宠物喂食的方法
    public static void eat(Pet p){
        p.eat();
    }
    //主人揍宠物的方法
    public static void hit(Pet p){
        p.hit();
    }
//    public void eat(Dog d){ //主人给狗喂食
//        d.eat();
//    }
//    public void eat(Cat c){ //主人给猫喂食
//        c.eat();
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请先输入宠物的姓名:");
        String name=sc.next();
        System.out.println("请选择您要领养的宠物(1.狗  2.猫)");
        int n=sc.nextInt();
        //抽象类一般情况下是不能被实例化
        Pet p=null;
        if(n==1){
            //类型是父类Pet  实际指向的是狗对象 所以才可以强转成dog对象
            p=new Dog();
            System.out.println("请选择狗狗的品种(1.泰迪  2.二傻子 3.金毛 4.德国牧羊犬)");
            int num=sc.nextInt();
            String type="";
            switch(num){
                case 1:type="泰迪";break;
                case 2:type="二傻子";break;
                case 3:type="金毛";break;
                case 4:type="德国牧羊犬";break;
            }
             //pet使用 子类狗对象 独有的属性 所以需要类型转换成狗类
             //  当你不知道 他实际指向什么类型时 可以提前判断
             if(p instanceof Dog) {
                 Dog d = (Dog) p;
                 d.type = type;
             }
        }else if(n==2){
            p=new Cat();
            System.out.println("请选择猫的性别(1.公猫  2.母猫)");
            int num=sc.nextInt();
            String sex= num==1?"公猫":num==2?"母猫":"泰国猫";
            //三目 套三目
            //表达值1？ 值1: 表达式2?值2:值3
            if(p instanceof Cat) {
                Cat c = (Cat) p;
                c.sex=sex;
            }
        }
        p.name=name;
        System.out.println("宠物领养成功,宠物信息如下:");
        p.print();
        do {
            System.out.println("开始跟宠物互动(1.喂食 2.玩耍 3.打  4.退出)");
            int index=sc.nextInt();

            if(index==4) break;
            switch (index){
                case 1:  eat(p);break;
                case 2:  //play(p);break;
                case 3:  hit(p);break;
            }
            p.print();
        }while(true);

        System.out.println("退出系统");
    }
}
