package day18;

public class TestTicket2 {
    public static void main(String[] args) {
        Ticket2 tt=new Ticket2();
        Thread t1=new Thread(()->{
            String name=Thread.currentThread().getName();
            for(int i=0;i<10;i++){
                tt.buy(name);
            }
        },"刘剑涛");
        Thread t2=new Thread(()->{
            String name=Thread.currentThread().getName();
            for(int i=0;i<10;i++){
                tt.add(name);
            }
        },"铁道部");

        t1.start();
        t2.start();
    }
}
