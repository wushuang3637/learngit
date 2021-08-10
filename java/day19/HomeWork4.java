package day19;
/*
编写一个程序，启动三个线程，
三个线程的名称分别是 A，B，C；
每个线程将自己的名称在屏幕上打印5遍，
打印顺序是ABCABCABCABCABC
 */
public class HomeWork4 {
    int num=1;  //=>  2  3==>1 2 3
    public static void main(String[] args) {
        HomeWork4 h=new HomeWork4();
        new Thread(()->{
            String name=Thread.currentThread().getName();
            int number=0;
            while(true){
                synchronized (h) {
                    if(h.num==1) {  //表示要打印A
                        if(number==5) break;
                        number++;
                        h.num = 2;
                        System.out.print(name);
                        try {
                            h.notifyAll();
                            h.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        },"A").start();
        new Thread(()->{
            String name=Thread.currentThread().getName();
            int number=0;
            while(true) {
                synchronized (h) {
                    if (h.num == 2) { //表示要打印B
                        if (number == 5) break;
                        number++;
                        h.num = 3;
                        System.out.print(name);
                        try {
                            h.notifyAll();
                            h.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        },"B").start();
        new Thread(()->{
            String name=Thread.currentThread().getName();
            int number=0;
            while(true) {
                synchronized (h) {
                    if (h.num == 3) { //表示要打印C
                        if (number == 5) break;
                        number++;
                        h.num = 1;
                        System.out.print(name);
                        try {
                            h.notifyAll();
                            h.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        },"C").start();
    }
}
