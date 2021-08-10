package day10;

import day9.FactoryBean;

public class TestStringBuilder {
    public static void main(String[] args) {
       // String ==>final char[]
       // StringBuffer ==>char[]
        String s="abc";
        //创建StringBuilder 或 StringBuffer对象
        //StringBuilder sb="sss"; 错误的
        StringBuilder sb=new StringBuilder("springcloud");
        StringBuilder sb3=new StringBuilder("springcloud");

        StringBuffer  sb2=new StringBuffer("");
        System.out.println(sb+" "+sb2+" "+sb3);
        System.out.println(sb==sb3);   //false
        System.out.println(sb.equals(sb3)); //false
        //string .equals最特殊 判断里面的值是否一致
        //其他类的equals 方法  一般都是 跟 == 是一个意思
        String str="springcloud";
        System.out.println(str.equals(sb));  //false
        sb.append("spring");
        System.out.println(sb);
        //在指定位置插入元素
        sb.insert(6,"boot");
        System.out.println(sb);
        sb.delete(10,sb.length());
        System.out.println(sb);
        //sb.deleteCharAt();
        //删除指定位置的字符
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.replace(1,5,"java");
        System.out.println(sb);
        /*
        sb2.append();
        sb2.replace();
        sb2.insert();
        sb2.deleteCharAt();
        sb2.delete();*/
        //StringBuilder和StringBuffer 区别
//        StringBuilder  线程不安全的   运行效率更快   常用的
//        StringBuffer   线程安全的     运行效率更慢

    }
}
