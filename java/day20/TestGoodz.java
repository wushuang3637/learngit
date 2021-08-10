package day20;

public class TestGoodz {
    public static void main(String[] args) {
        Goodz g=new Goodz("羊排",10,0);
        new Thread(new Consumer(g),"柴鹏程").start();
        new Thread(new Producer(g),"徐洪水").start();
        //System.out  //outputstream

    }
}
