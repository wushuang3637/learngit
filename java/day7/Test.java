package day7;

public class Test {
    public static void main(String[] args) {
        //while(true);
        //&&  &  ||  |   !
        //while(true){};

        //&&  和  & 区别?   面试题
        int a=10;
        int b=20;
        // 如果是&& 如果表达式1是false
        //  表达式2 就不会执行了   因为表达式2无论是true/false
        //都不会满足条件  所以&& 有短路功能  为了提高效率
        //如果是&  没有短路功能  两个表达式都会执行  所以效率不高
        /*
        if(a++>20 & b++>30){ }
        System.out.println(a+" "+b);  //11   21

        //String  s=NULL  null;
        String NULL=null;

        //通过空的内容调用别的方法或者属性 到会出现一个问题
        //出现 空指针异常  NullPointerException
        NULL.length();   */

        // switch 可以支持什么类型   byte  shrot  int  char
        //  jdk1.7 之后  支持String类型
        //  还支持枚举类型
        byte b1=10;
        short s1=10;
        char  ch1='+';
        String str="111";
        AAA a1 =null;
        switch(a1){
            //case 1:
            case APPLE:
            case ORANGE:
            case BANANA:
        }

    }
}
enum  AAA{
    APPLE,ORANGE,BANANA;
}
class A{

}
class B{

}