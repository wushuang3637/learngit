package day17;

public class Demo {
    public static void main(String[] args) throws  Exception {
        A a=new A();
        a.num=123;
        a.str="java";
        B b=new B();
        b.bStr="Bjava";
        a.b=b;
        A a2=(A)a.clone();
        System.out.println(a.num+" "+a.str+" "+a.b.bStr);
        System.out.println(a2.num+" "+a2.str+" "+a2.b.bStr);

        a.b.bStr="ABCJava";


        System.out.println(a.num+" "+a.str+" "+a.b.bStr);
        System.out.println(a2.num+" "+a2.str+" "+a2.b.bStr);

    }
}
