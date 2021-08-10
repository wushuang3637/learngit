package day18;
//普通用户和VIP用户 去看病
//1. 50     10
//2. 1倍    2倍
//3. 优先级 VIP更高
//4. 10个普通用户之后 全部看VIP 然后在看剩余普通用户
public class Demo3 {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            String name=Thread.currentThread().getName();
            for(int i=1;i<=10;i++){
                System.out.println("第"+i+"个"+name+"看病");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"VIP");
        Thread t2=new Thread(()->{
            String name=Thread.currentThread().getName();
            for(int i=1;i<=50;i++){
                if(i==11){
                    try {
                        t1.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("第"+i+"个"+name+"看病");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"普通用户");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
