package day18;

import java.util.Random;

public class Rabbit implements Runnable{
    Game g;
    int sum;
    public Rabbit(Game g){
        this.g=g;
        this.sum=g.sum;
    }
    public void run() {
        String name=Thread.currentThread().getName();
        Random r=new Random();
        while(true){
            if(g.isOver) break;  //检测有人 胜利了 结束比赛
            int n=r.nextInt(10)+1;  //1-10随机数
            if(sum<n) n=sum;
            sum-=n;
            System.out.println(name+"跑了"+n+"米,距离终点"+sum+"米");
            try {
                Thread.sleep(500); //睡眠0.5S
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (sum==0){
                System.out.println(name+"已经到达终点");
                g.isOver=true;
            }
        }
    }
}
