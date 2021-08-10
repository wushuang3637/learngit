package day18;

import java.util.Random;

public class Tortoise  implements Runnable{
    Game g;
    int sum;
    public Tortoise(Game g){
        this.g=g;
        this.sum=g.sum;
    }
    public void run() {
        String name=Thread.currentThread().getName();
        Random r=new Random();
        while(true){
            if(g.isOver) break;  //检测有人 胜利了 结束比赛
            int n=r.nextInt(5)+1;  //1-5随机数
            if(sum<n) n=sum;
            sum-=n;
            System.out.println(name+"跑了"+n+"米,距离终点"+sum+"米");
            try {
                Thread.sleep(200); //睡眠0.2S
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
