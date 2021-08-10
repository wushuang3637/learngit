package day18;
//实现两个购票   +  1个人买票 1个生成票
public class Ticket2 {
    int sum=10; //总票数
    int count;  //第几张
    //同步方法: 表示锁住的 当前对象  this
    public synchronized void buy(String name){  //买一次票
        sum--;
        count++;
        System.out.println(name+"买了第"+count+"张，剩余"+sum+"张");
        try {
            Thread.sleep(1000);
            notifyAll();
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void add(String name){  //生成一次票
        sum++;
        System.out.println(name+"生产了1张票，剩余"+sum+"张");
        try {
            Thread.sleep(1000);
            notifyAll();
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
