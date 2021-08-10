package day19;

import java.util.Random;

//抽奖线程
public class Lucky implements Runnable{
    int[] arr = {10,5,20,50,100,200,500,800,2,80,300};
    boolean[] b=new boolean[arr.length];
    @Override
    public void run() {
        Random r=new Random();
        String name=Thread.currentThread().getName();
        while(true){
            synchronized (this) {
                //抽一次奖的过程  随机产生下标
                int index = r.nextInt(arr.length);
                if(b[index]) continue;
                b[index]=true;
                for (int i = 3; i > 0; i--) {
                    System.out.println(name + "开始摇奖剩余时间:" + i + "秒");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(name + "又产生了一个 " + arr[index] + " 元大奖");
                //..让其他人抽奖
                try {
                    notifyAll();
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
       }
    }
}
