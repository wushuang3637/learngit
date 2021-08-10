package day11;
//测试封装类
public class Demo {
    public static void main(String[] args) {
        //基本类型和封装类型 使用方式几乎一样的
        //只不过对象类型 可以按照对象处理 默认为null
        int a=10;
        Integer b=10;
        Integer c=new Integer(100);
        Byte b2=new Byte((byte)10);
        Byte b3=10;
        String str="123abc";
        Integer num=Integer.parseInt(str);
        Double num2=Double.parseDouble(str);
        boolean num3=Boolean.parseBoolean(str);

        Integer number=Integer.valueOf(str);
        Double number2=Double.valueOf(str);
        boolean number3=Boolean.valueOf(str);

        //如何将其他类型转换String
        //1. 通过+  拼接
        String s1=123+"";
        String s2=true+"";
        //2.  通过封装类提供的方法
        String s3=Integer.toString(123);
        String s4=Boolean.toString(true);

        //3. 通过String类提供的方法
        String s5=String.valueOf(123);
        String s6=String.valueOf(15.5);


    }
}
