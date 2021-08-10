package day19;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lock2 {
    private Lock l=new ReentrantLock();
    public void testLock(Thread t)throws Exception{
        // 尝试获取锁 ，获取成功返回true  获取失败返回false
        //l.tryLock()
        //2.tryLock(时间,单位)  指定时间之后 没有获取到锁 进入else
        if(l.tryLock(3, TimeUnit.SECONDS)){  // 相比lock() 性能 更好
            try {
                System.out.println(t.getName()+"获取当前锁");
                Thread.sleep(4000);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println(t.getName()+"执行结束释放了锁");
                l.unlock();
            }
        }else{
            System.out.println(t.getName()+"3秒后也获取不了锁，当前锁被人使用");
        }
    }

    public static void main(String[] args) {
        Lock2 l=new Lock2();
        new Thread(()->{
            try {
                l.testLock(Thread.currentThread());
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"线程1").start();
        new Thread(()->{
            try {
                l.testLock(Thread.currentThread());
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"线程2").start();
    }
}
