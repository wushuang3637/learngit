package day18;
/*
写两个线程  一个线程负责打印数字1-52
        另一个线程负责打印字母 A-Z
        打印顺序:12A34B....5152Z
 */
public class Demo4 {
    public static void main(String[] args) {
        Object o=new Object();
        new Thread(()->{
            int num=0;
            synchronized (o) {
                for (int i = 1; i <= 26; i++) {
                    System.out.print(++num);
                    System.out.print(++num);
                    //让其他人打印自己等待  释放锁
                    try {
                        o.notifyAll();
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }).start();
        new Thread(()->{
            synchronized (o){
                for (char c = 'A'; c <= 'Z'; c++) {
                    System.out.print(c);
                    try {
                        o.notifyAll();
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
