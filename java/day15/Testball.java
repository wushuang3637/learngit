package day15;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
//  红色球号码从1—33中选择；蓝色球号码从1—16中选择；请随机生成一注双色
//  球号码。（要求同色号码不重复）
//  自己手动输入自己投注的双色球号码   与随机产生的双色球比较
//  获奖规则如下
public class Testball {
    //用户投注的红号
    static Set<Integer> red=new TreeSet<>();
    //机器产生的红号
    static Set<Integer> machineRed=new TreeSet<>();
    static Integer blue;
    static Integer machineBlue;
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您投注的6个红号(1-33)");
        System.out.println("有重复自动重新输入:");
        while(red.size()<6){
            int n=sc.nextInt();
            if(n<1 || n>33){
                System.out.println("红号选择的范围有误，请重新输入");
                continue;
            }
            red.add(n);
        }
        System.out.println("请输入您投注的蓝号(1-16)");
        blue=sc.nextInt();
        System.out.println("您投注的号码红号:"+red+"，蓝号是:"+blue);
        //机器生成中奖号码    6个红  1个蓝
        System.out.println("系统开始摇号,请等待...");
        //延迟5秒
        for(int i=5;i>0;i--){
            System.out.println("系统开始摇号,请等待"+i+"秒");
            Thread.sleep(1000);
        }
        Random r=new Random();
        while(machineRed.size()<6){
            machineRed.add(r.nextInt(33)+1);
        }
        machineBlue=r.nextInt(16)+1;
        System.out.println("双色球号码生成成功红号:"+machineRed+",蓝号"+machineBlue);
        //求出中了几个红号 中了几个蓝号
        //red   blue
        //machineRed  machineBlue
        result();
        //33*32*31*30*29*28*16
    }
    public static void result(){
        int redCount=0;
        int blueCount=0;
        if(blue==machineBlue) blueCount++;
        for(Integer m:machineRed){
            for(Integer r:red){
                if(m==r) redCount++;
            }
        }
        System.out.println("您中了"+redCount+"个红号"+blueCount+"个蓝号");
    }
}

