package day11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) throws ParseException {
        //1. java.util.Date
        Date d=new Date();
        System.out.println(d); //打印默认国际化 时间
        //可以通过对象格式化日期  参数表示日期格式
        //y 年 M 月 d日  h 12进制时  H 24进制
        //m 分  s 秒  S毫秒  a 上下午
        SimpleDateFormat sdf=new
                SimpleDateFormat("yyyy-MM-dd HH:mm:ss S a");
        //Date===>String
        String time=sdf.format(d);
        System.out.println(time);
        //String==>Date
        Date d2=sdf.parse("2020-12-12 12:29:30 123 上午");
        System.out.println(d2);

        //2.日历对象  Calendar
        //创建日历对象
        Calendar c=Calendar.getInstance();
        Date d3=new Date();
        //向日历对象设置时间
        c.setTime(d2);
        //通过日历对象里面的常量参数 来获取不同的值
        //1-7   1是星期日
        int count=c.get(Calendar.DAY_OF_WEEK);  //每周第几天
        int count2=c.get(Calendar.DAY_OF_YEAR); //一年的第几天
        int num=c.get(Calendar.MONDAY);
        int num2=c.get(Calendar.MONTH);
        int num3=c.getFirstDayOfWeek();
        System.out.println(count+" "+count2+" "+num+" "+num2);
        System.out.println(num3);
    }
}
