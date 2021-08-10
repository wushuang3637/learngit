package day18;

public class TestTicket {
    public static void main(String[] args) {
        Ticket t=new Ticket(10); //t 实现了Runnable接口
        Thread t1=new Thread(t,"刘明");
        Thread t2=new Thread(t,"晓东");
        Thread t3=new Thread(t,"木吒");
        t1.start();
        t2.start();
        t3.start();
    }
}
