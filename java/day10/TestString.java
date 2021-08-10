package day10;

public class TestString {
    public static void main(String[] args) {
//        String a="hello2";
//        String b="hello"+2;
//        System.out.println(a==b);   //true
//        b="hello";
//        String c=b+2;  // c= b的引用+2
//        System.out.println(a==c);  //false

//        String a="hello2";
//        //final 修饰String  在编译时 会替换实际的值
//        // 不在原来引用地址  b  和 "hello"  都是常量
//        final String b="hello";
//        String c=b+2;
//        System.out.println(a==c);  //true


        //String a="hello2";
        // 随便b 修饰的   但是 b的结果是需要方法运行之后返回的
        // 只有在运行的时候才可以确定  这时只能认为b 还是一个b
        // 的引用   而不是指向常量池
//        final String b=getString();
//        String c=b+2;
//        // == 在String 判断的不是值相同    表示引用地址是否一致
//        System.out.println(a==c);   //false
        String a="hello";
        String b=new String("hello");
        String c=new String("hello");
         //会在常量池中查找是否有相同内容的字符串
        //如果存在就返回该字符串的引用
        String d=b.intern();
        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(b==d);
        System.out.println(a==d);

    }
    public static String getString(){
        return "hello";
    }
}
class A{
    @Override
    public String toString() {
        return "123";
    }
}
