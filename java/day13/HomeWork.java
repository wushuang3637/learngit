package day13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/*
1.给定一个日期值，计算若干天数后的日期值
2.获得一个日期所在的周的星期几的日期，如要找出2002
年2月3日所在周的星期一是几号
3.计算促销日期， 输入一个生产日期，在输入保质期时间，
促销日期是在该商品过期日前两周的周三
  计算哪一天是促销日？
 */
public class HomeWork {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入第几天后:");
//        int day=sc.nextInt();
//        LocalDate ld=LocalDate.now();
//        ld=ld.plusDays(day);
//        System.out.println(ld);
        System.out.println("请输入一个日期(年-月-日):");
        String time=sc.next();
        LocalDate ld=LocalDate.parse(time);
        System.out.println("请输入星期几:(1-7)");
        int num=sc.nextInt();
        //定义枚举
        DayOfWeek dw=null;
//        switch(dw){
//            case MONDAY:
//            case THURSDAY:
//            case SUNDAY:
//        }
        switch(num){
            case 1: dw=DayOfWeek.MONDAY; break;
            case 2: dw=DayOfWeek.TUESDAY; break;
            case 3: dw=DayOfWeek.WEDNESDAY; break;
            case 4: dw=DayOfWeek.THURSDAY; break;
            case 5: dw=DayOfWeek.FRIDAY; break;
            case 6: dw=DayOfWeek.SATURDAY; break;
            case 7: dw=DayOfWeek.SUNDAY; break;
        }
        ld=ld.with(dw);
        System.out.println("该日期是"+ld.getDayOfMonth()+"号");

    }
}
