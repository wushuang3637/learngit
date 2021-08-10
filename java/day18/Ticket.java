package day18;
//通过线程模拟多人购票
public class Ticket  implements Runnable{
    int sum;//一共有多少票
    int count;//第几张票
    public Ticket(int sum){
        this.sum=sum;
    }
    public void run() {
        String name=Thread.currentThread().getName();
        //通过synchronized修饰代码块:同步代码块
        synchronized (this){//表示线程锁住了当前对象
            //里面的执行内容
            for(int i=0;i<10;i++){
                if(sum==0) break;
                count++;
                sum--;
                System.out.println(name+"买了第"+count+"张票剩余"+sum+"张");
                try {
                    Thread.sleep(500);  //模拟网络延迟
                    //通知其他人 可以买票了
                    notifyAll(); //先唤醒所有人
                    wait();  //自己等待  并且释放锁  this.wait()  this可以省略
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
