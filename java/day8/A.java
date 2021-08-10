package day8;

public class A extends B {
    public A(){
        //super()
        System.out.println("A类无参");
    }

    public static void main(String[] args) {
        A c=new A();  // C  B  A
    }
}
class B extends C{
    public B(){
       this(10,20); //第一行
       //super();//   都需要第一行
       System.out.println("B类无参");

    }
    public B(int a,int b){
        super(10);
    }

}
class C{
    //public C(){}
    public C(int a){
        System.out.println("C类无参");
    }
}
