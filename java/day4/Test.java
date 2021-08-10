package day4;

import java.util.Scanner;

/*
* 综合练习
*/
public class Test {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.println("欢迎进入XXX系统游戏平台");
            System.out.println();
            System.out.println("请选择您需要的游戏:");
            System.out.println("***********************");
            System.out.println("\t\t1.游戏1");
            System.out.println("\t\t2.游戏2");
            System.out.println("\t\t3.游戏3");
            System.out.println("\t\t4.游戏4");
            System.out.println("\t\t5.退出");
            System.out.println("***********************");
            System.out.print("请选择,输入数字:");
            n = sc.nextInt();
            switch (n) {
                case 1: game1();break;
                case 2: game2();break;
                case 3: game3();break;
                case 4: game4();break;
                default: if(n!=5) System.out.println("您输入错误,请重新输入");
            }
        }while(n!=5);

        System.out.println("退出系统");

    }
    public static void game1(){

        System.out.println("您已经进入房间1");
        int num=0;
        for(int i=0;i<5;i++){
            System.out.print("您玩了第"+(i+1)+"局,成绩是:");
            int score=sc.nextInt();
            if(score>80) num++;
            if(i!=4) {
                System.out.print("继续玩吗?(yes/no)");
                String yn = sc.next();
                //字符串判断两值相同 不使用==   使用equals（）
                if (yn.equals("no")) {
                    System.out.println("您中途退出了");
                    break;
                }
            }
        }

        if(num>=4) System.out.println("恭喜您 是一级");
        else if(num>=3) System.out.println("恭喜您 是二级");
        else System.out.println("很遗憾没有晋级");

    }
    public static void game2(){
        System.out.println("您已经进入房间2");
        System.out.println("请选择游戏类型:");
        System.out.println("1.棋牌类");
        System.out.println("2.竞技类");
        int num=sc.nextInt();
        System.out.println("请输入游戏时长:");
        int time=sc.nextInt();

        String name=""; //游戏名
        double zhekou=0.8;//折扣
        double price=0;//金额
        if(time>10) zhekou=0.5;

        if(num==1){
           name="棋牌类";
           price=time*10*zhekou;
        }else{
            name="竞技类";
            price=time*20*zhekou;
        }
        System.out.println("您玩了"+name+"游戏," +
                "时长是:"+time+",享受的" +
                "折扣是"+(int)(zhekou*10)+"折" +
                "，您需要支付"+price+"人民币");
    }
    public static void game3(){
        System.out.println("您已经进入房间3");
    }
    public static void game4(){
        System.out.println("您已经进入房间4");
    }

}
