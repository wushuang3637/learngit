package day1;
//定义包的意思  一般会在类文件中的第一行写
public class Demo{
    //蓝色 属于关键字
    //定义程序入口  方法名:main   参数String[]
    public static void main(String[] aaa){
        System.out.print("我是张三");
        //数据类型  变量名=值;
        //-128--127
        byte a=127;
        //2^15-1   32767
        short s=32767;
        //int   2147483647
        int i=2147483647;
        long l=34223454;
        float f=15.5f;
        //  15 默认认为int 类型
        float f2=15;  // int==>float  类型自动提升
        double d=15.5;
        // 字符串  必须双引号
        String str="aaaa中文";
        boolean b=true;
        //字符  通过'' 括起来  只能有一个字符
        char c='*';

        //if  else   switch   for  while
    }
    //不是入口 只是一个方法
    public static void aaa(String[] sss){

    }
    //不是入口 只是一个方法
    public static void main(){

    }
}

