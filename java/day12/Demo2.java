package day12;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Demo2 {
    public static void main(String[] args) {
        //测试 LocalDate
        Instant instant=Instant.now();  //现在的时间戳
        LocalDate ld=LocalDate.now();
        LocalTime lt=LocalTime.now();
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("时间戳:"+instant);
        System.out.println("日期:"+ld);
        System.out.println("时间:"+lt);
        System.out.println("日期时间:"+ldt);


        System.out.println("每月第几天:"+ld.getDayOfMonth());
        System.out.println("星期几:"+ld.getDayOfWeek()); //返回枚举
        System.out.println("每年第几天:"+ld.getDayOfYear());

        System.out.println("修改日期");
        ld=ld.withYear(2020);// 修改年    生成了一个新的LocalDate对象
        ld=ld.withMonth(12);
        //ld=ld.withDayOfYear(10);  //一年的第10天
        ld=ld.withDayOfMonth(7);  //一月的第10天
        ld=ld.with(DayOfWeek.FRIDAY) ;//修改成本周星期五
        //...

        ld=ld.plusWeeks(10);
        //...
        System.out.println(ld);


        LocalDate.now();
        LocalDate ld2=LocalDate.of(2012,10,20);
        LocalTime.of(10,20,30);
        LocalDateTime.of(2012,8,10,10,20,30);


        //日期之间的运算 需要 until()  用于计算两个日期相差的内容
        // 日期1.until(日期2).getYears()
        //                   .getMonths()   ....

        //请输入自己生日，计算出您几年几岁了？
        LocalDate now=LocalDate.now();
        LocalDate begin=LocalDate.of(1990,8,20);
        //2012-08-12
        //手动输入日期:
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的出生年月(年-月-日):");
        String time=sc.next();
        //String==>LocalDate
        begin=LocalDate.parse(time);

        int num=begin.until(now).getYears();
        System.out.println("您今年:"+num+"岁了");
        //找出下个月倒数第三天是哪一天

        //+2月-3天
        ld=LocalDate.now().plusMonths(2);  //加2月
        ld=ld.withDayOfMonth(1);  //天数清1
        ld=ld.plusDays(-3);   //-3天
        System.out.println("下个月倒数第三天是:"+ld);  //2021-1-29
        //.输入小王和小李生日， 求出他们相差几年  几月   几日?
        //begin  now
        int year=begin.until(now).getYears();
        int month=begin.until(now).getMonths();
        int day=begin.until(now).getDays();
        System.out.println(year+" "+month+" "+day);


        //Date===>LocalDate
        Date d=new Date();
        Instant ins=d.toInstant();  //通过日期创建时间戳对象
        //设置时区   （获取系统默认时区）
        LocalDate newld=ins.atZone(ZoneId.systemDefault()).toLocalDate();


        //LocalDate ==>Date
        //获取时区
        ZoneId zone=ZoneId.systemDefault();
        //获取时间戳
        Instant ins2=newld.atStartOfDay().atZone(zone).toInstant();
        Date d2=Date.from(ins2);
    }
}
