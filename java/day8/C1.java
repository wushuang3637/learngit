package day8;

public class C1 {
    public static void main(String[] args) {
        C1 obj1=(C1) new C2();
        C2 obj2=(C2) new C3();
        C2 obj3=(C2) new C1();
        C3 obj4=(C3) obj2;
    }
}
class C2 extends C1{}
class C3 extends C2{}

