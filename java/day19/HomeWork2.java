package day19;

public class HomeWork2 {
    public static void main(String[] args) {
        new Thread(()->{
            String name=Thread.currentThread().getName();
            for(int i=1;i<=1000;i++){
                if(i%5==0) System.out.println(name+"="+i);
            }
        },"线程1").start();
        new Thread(()->{
            String name=Thread.currentThread().getName();
            for(int i=1001;i<=2000;i++){
                if(i%5==0) System.out.println(name+"="+i);
            }
        },"线程2").start();
        new Thread(()->{
            String name=Thread.currentThread().getName();
            for(int i=2001;i<=3000;i++){
                if(i%5==0) System.out.println(name+"="+i);
            }
        },"线程3").start();
    }
}
