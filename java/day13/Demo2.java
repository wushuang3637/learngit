package day13;

import day4.Test;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;

public class Demo2 {
    public static void main(String[] args){
        // FileNotFoundException
        //FileInputStream fis=new FileInputStream("d://a.txt");
        // IOException
        //fis.read();
        //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        //ParseException
        //sdf.parse("2012-08-12");
        //NullPointException  空指针异常
//        String str="abcdefe";
//        str.indexOf("abc");
//        Test t=new Test();
//        t.hashCode();

//          A a=new B();
//          B b=(B)a;
//           if(a instanceof C)  {
//               //ClassCastException
//               C c=(C)a;
//           }
           //"123" ==>123
           //NumberFormatException  数字转换异常
//           int i=Integer.parseInt("123");
//           int i2=Integer.valueOf("123");
//           // 123===>"123"
//           String s1=123+"";
//           String s2=Integer.toString(123);
//           String s3=String.valueOf(123);

            //  ArithmeticException: / by zero
            int num1=10;
            int num2=0;
            int result=num1/num2;

    }
}
class A{ }
class B extends A{ }
class C extends A{ }
