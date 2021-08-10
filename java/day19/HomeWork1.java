package day19;

import java.util.Random;

/*线程1模拟温度传感器，每隔500毫秒产生并输出
一个20-40的随机数，用以表示当前温度。
线程2模拟湿度传感器，每隔400毫秒产生并输出
一个70-90的随机数，用以表示当前湿度。
线程3模拟光照传感器，每隔300毫秒产生并输出
一个20-80的随机数，用以表示当前光线强度*/
public class HomeWork1{
    public static void main(String[] args) {
        Random r=new Random();
        new Thread(()->{
            String name=Thread.currentThread().getName();
            while(true){
                int result=r.nextInt(21)+20;
                System.out.println(name+":"+result);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"温度").start();
        new Thread(()->{
            String name=Thread.currentThread().getName();
            while(true){
                int result=r.nextInt(21)+70;
                System.out.println(name+":"+result);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"湿度").start();
        new Thread(()->{
            String name=Thread.currentThread().getName();
            while(true){
                int result=r.nextInt(61)+20;
                System.out.println(name+":"+result);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"光照").start();
        new Thread().interrupt();
    }
}
