package day13;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

/*
1. 模拟实现一个记录手机视频时长  每次视频10分钟（也可以随机）
第二次累加上一次的时间
   结果如下: 通话时长    "10:15:12";
 */
public class HomeWork3 {
    public static void main(String[] args) {
        LocalTime lt=LocalTime.MIN;  //获取时间最小值    00:00
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("开始通话");
            int mm=r.nextInt(60);
            int ss=r.nextInt(60);
            lt=lt.plusMinutes(mm);
            lt=lt.plusSeconds(ss);
            System.out.println("本次通话时长:"+mm+"分"+ss+"秒");
            System.out.println("是否继续通话(y/n):");
            String yn=sc.next();
            if(yn.equals("n")) break;
        }
        System.out.println("累计通话时长:"+lt);

    }
}
