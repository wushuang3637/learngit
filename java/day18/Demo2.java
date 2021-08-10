package day18;

public class Demo2 {
    public static void main(String[] args) {
        //线程对象.join()  A  B  C--->ABC
        // ABCABCABCABC  线程就3个 A  B  C  同步锁
        Thread t1=new Thread(()->{
            String name=Thread.currentThread().getName();
            System.out.println(name);
        },"A");
        Thread t2=new Thread(()->{
            try {
                t1.join();  //t1 执行结束了 才会执行 t2线程
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name = Thread.currentThread().getName();
                System.out.println(name);

        },"B");
        Thread t3=new Thread(()->{
            try {
                t2.join();  //t2执行结束了  才会执行t3
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name=Thread.currentThread().getName();
            System.out.println(name);

        },"C");

        t1.start();
        t2.start();
        t3.start();

        //A===>B===>C
    }
}
