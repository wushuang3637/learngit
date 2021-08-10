package day9;
//通过枚举实现单例模式 1:  简化版  实现自己的单例模式
public enum Singleton1 {
    INSTANCE;
}
//通过枚举实现单例模式 2:  完整版  通过枚举实现一个类是单例模式
class Singleton2{
    private Singleton2(){}
    public static Singleton2 getInstance(){
        return EnumName.INSTANCE.s;
    }
    private enum EnumName{
        INSTANCE;
        private EnumName(){ //只有执行一次 对象也只会new 一次
            s=new Singleton2();
        }
        private Singleton2 s=null;
    }

    public static void main(String[] args) {
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton2.getInstance());
    }
}


