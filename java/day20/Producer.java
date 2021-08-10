package day20;
/*
生产者线程，当 当前数量<最大数量时候.
生产者要进行生产.提示生产数量和当前数量
生产结束后,提示消费者可以购买
 */
public class Producer implements  Runnable{
    Goodz g;
    public Producer(Goodz g){
        this.g=g;
    }
    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        while(true){
            synchronized (g){
                if (g.num < g.max) { //可以进入生产
                    int number = g.max - g.num;  //生产的数量
                    try {
                        Thread.sleep(2000); //模拟生产花费的时间
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    g.num = g.max;
                    System.out.println(name + "生产了" + number + "个商品,目前商品库存:" + g.num);
                    try {
                        g.notifyAll();
                        g.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
