package day12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        cal.setTime(new Date());
        //10天后日期   类似于单位      加的数值
        cal.add(Calendar.DAY_OF_YEAR,10);
        cal.add(Calendar.MONTH,2);  //2月后
        System.out.println(cal.getTime());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(cal.getTime()));
    }
}
