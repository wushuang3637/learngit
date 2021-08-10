package day13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/*
2. 模拟制作一个日历工具 输入 年  和月
    展示  该月的日期
   如 输入2020 年  12月
   一    二   三   四   五   六    日
         1     2   3     4    5    6
   7     8     9    10   11   12   13
   ...
 */
public class HomeWork4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个年份:");
        int year=sc.nextInt();
        System.out.println("\t\t"+year+"年");
        for(int i=1;i<=12;i++){
            month(year,i);
        }
    }
    //每个月 日历
    public static void month(int year,int month){
        System.out.println("\t\t"+month+"月");
        LocalDate ld=LocalDate.of(year,month,1);
        char[] week={'一','二','三','四','五','六','日'};
        for(int i=0;i<week.length;i++){
            System.out.print(week[i]+"\t");
        }
        System.out.println(); //换行
        // 获取枚举 获取枚举对应的数字
        int num=ld.getDayOfWeek().getValue();
        //通过 星期几  前面需要拼接 几个 \t
        for(int i=1;i<num;i++){
            System.out.print("\t");
        }
        //每月 一共多少天
        int max=ld.lengthOfMonth();
        for(int i=1;i<=max;i++){
            System.out.print(i+"\t");
            //如果是星期日 需要换行
            if(ld.withDayOfMonth(i).getDayOfWeek()== DayOfWeek.SUNDAY)
                System.out.println();
        }

        System.out.println();
    }
}
