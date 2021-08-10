package day19;

public class HomeWork3 {
    public static void main(String[] args) {
        Lucky l=new Lucky();
        new Thread(l,"抽奖箱1").start();
        new Thread(l,"抽奖箱2").start();
    }
}
