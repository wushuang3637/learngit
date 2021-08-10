package day13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/*
3.计算促销日期， 输入一个生产日期，在输入保质期时间(天单位)，
促销日期是在该商品过期日前两周的周三
计算哪一天是促销日？
 */
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个生产日期:");
        String product=sc.next();
        System.out.println("请输入保质期(天):");
        int day=sc.nextInt();
        //计算 过期时间  product +day天
        LocalDate ld=LocalDate.parse(product);
        System.out.println("生产日期:"+ld);
        ld=ld.plusDays(day);
        System.out.println("过期时间:"+ld);
        //计算促销日  过期时间前两周 的周三
        ld=ld.plusWeeks(-2);
        ld=ld.with(DayOfWeek.WEDNESDAY);
        System.out.println("促销日:"+ld);
    }
}
