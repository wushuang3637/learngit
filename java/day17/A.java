package day17;

public class A implements Cloneable{
    Integer num; //基本
    String str;  //string
    B  b;       //引用类型
    @Override
    protected Object clone() throws CloneNotSupportedException {
         A a=(A)super.clone();
         a.b=(B)b.clone();  //深克隆
         return a;
    }
}
class B implements Cloneable{
    String bStr;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
