package day20;

import java.util.Random;

/*
消费者线程, 消费者购买商品数量随机数而定，
不能超过商品最大数量,如果购买数量大于商品当前数量.
需要提示 购买的数量，库存不足。   呼叫生产者开始生产物品
如果购买的商品数量小于商品当前数量则。正常购买 ，
提示购买的数量和剩余数量
 */
public class Consumer implements Runnable{
    Goodz g;
    public Consumer(Goodz g){
        this.g=g;
    }
    @Override
    public void run() {
        Random r=new Random();
        String name=Thread.currentThread().getName();
        while(true){
            synchronized (g){
                //消费者消费数量随机而定
                int number = r.nextInt(g.max) + 1;
                if (number > g.num) {  //购买的数量大于库存 买不了
                    System.out.println(name + "要购买" + number + "个商品,但是库存不足!!!");
                    //通知生成者生成商品
                    try {
                        g.notifyAll();
                        g.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                g.num -= number;
                System.out.println(name + "成功购买了" + number + "个商品, 目前剩余:" + g.num);
                try {
                    Thread.sleep(2000);//模拟购买商品的时间
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
