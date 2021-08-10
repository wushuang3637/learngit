package day17;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
//    public void test(int a,int b){
//        System.out.println("int");
//    }
//    public void test(float f1,float f2){
//        System.out.println("float");
//    }
    public void test(Integer a,Integer b){
        System.out.println("Integer");
    }
    public void test(double d,double d2){
        System.out.println("double");
    }
    public void test(Double d1,Double d2){
        System.out.println("Double");
    }
    public static void main(String[] args) {
        //int Integer float double Double
        //优先级  先优先于基本类型 在优先封装类型
        //int-->float-->double-->Integer ....
        Test t=new Test();
        t.test(10,20);
        t.test(15.5,25.5);

        String abc=String("123");
        String str="abc";
        String str2=new String("123");
    }

    public static String String(String s){
        return "abc";
    }
}
