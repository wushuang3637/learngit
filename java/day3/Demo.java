package day3;

public class Demo {
    public static void main(String[] abc) {
        //java程序运行步骤：1. 编写源程序 XX.java
         //2.   编译 XX.class(字节码文件  二进制文件)
        //  javac XX.java  ===>XX.class
        //3.  运行程序    在程序运行时  可以通过空格隔开传递参数
        //java  XX  参数1 参数2 ...
        //System.out.print(aaa长度是0   aaa[0]);
//        System.out.print(abc[0]);
//        System.out.print(abc[1]);
//        System.out.print(abc[2]);

        /*
        * char 有三种赋值方式:
        *      字符
        *      数字==>ascii
        *      Unicode
        * */
        //只能描述一个字符
        char ch1='@';
        //整形转换一个asuii码  对应一个字符
        //65-90  A-Z   97-122  a-z
        char ch2=122;
        System.out.println(ch1+" "+ch2);
        //表示 Unicode 可以描述 见过任意字符
        //组合方式 有65535种  可以通过char 保存任意汉字
        char ch3='\u6312';
        System.out.println(ch1+" "+ch2+" "+ch3);
        //你好这是java
        //\u6312\u6312\u6312\u6312java
        //小范围的值 ==>大范围的值 会类型提升
        byte b=100;
        double d=15.5;
        int i=200;
        int i2=b+i;
        double d2=d+i;
        String str="123";
        String sss=d+i+str;
        //强制类型转换
        double d3=25.5;
        int i3=(int)d3;
        int i4=100;
        byte b3=100;
        byte b4=(byte)i4;

    }
}
