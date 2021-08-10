package day18;

public class Test {
    public static void main(String[] args) {
        Game g=new Game(100);
        Rabbit r=new Rabbit(g);
        Tortoise t=new Tortoise(g);
        Thread t1=new Thread(r,"兔子");
        Thread t2=new Thread(t,"乌龟");
        t1.start();
        t2.start();
        /*
        写两个线程  一个线程负责打印数字1-52
        另一个线程负责打印字母 A-Z
        打印顺序:12A34B....5152Z

        创建三个线程  ABCABCABCABCABCABC
        */
    }
}
