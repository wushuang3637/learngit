package day19;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Lock锁
public class Lock1{
    private static Lock l=new ReentrantLock();
    public void  lockTest(Thread t){
        l.lock(); //获取锁  syn(this) 自动获取当前对象的锁
        try {
            System.out.println(t.getName()+"获取当前的锁对象");
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println(t.getName()+"使用完毕开始释放锁");
            l.unlock();
        }
    }
    public static void main(String[] args) {
        Lock1 l=new Lock1();
        Thread t1=new Thread(()->{
            for(int i=0;i<5;i++) {
                synchronized (l) {
                    l.lockTest(Thread.currentThread());  //类似于原来的同步方法
                    l.notifyAll();
                    try {
                        l.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"线程1");
        Thread t2=new Thread(()->{
            for(int i=0;i<5;i++) {
                synchronized (l) {
                    l.lockTest(Thread.currentThread());  //类似于原来的同步方法
                    l.notifyAll();
                    try {
                        l.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"线程2");
        t2.start();
        t1.start();

    }
}
