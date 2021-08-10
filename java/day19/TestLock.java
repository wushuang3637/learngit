package day19;
//编写死锁
public class TestLock implements Runnable{
    //创建两个对象锁
   static Object o1=new Object();
   static Object o2=new Object();
    boolean b;
    @Override
    public void run() {
        if(b){  //线程1
            synchronized (o1){
                System.out.println("线程1开始执行，锁主了o1对象");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2){
                    System.out.println("线程1开始再锁o2对象");
                }
            }
        }else{ //线程2
            synchronized (o2){
                System.out.println("线程2开始执行，锁主了o2对象");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1){
                    System.out.println("线程2开始再锁o1对象");
                }
            }
        }
    }
    public static void main(String[] args) {
        TestLock tl1=new TestLock();
        tl1.b=true;
        TestLock tl2=new TestLock();

        Thread t1=new Thread(tl1);
        Thread t2=new Thread(tl2);
        t1.start();
        t2.start();
    }
}
