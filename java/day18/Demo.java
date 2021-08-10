package day18;

public class Demo {
    public static void main(String[] args) {
        //实现年轻人 和老年人 去爬山  每次 100米
        Thread t1=new Thread(()->{
            String name=Thread.currentThread().getName();
            int sum=1000;
            for(int i=0;i<10;i++){
                System.out.println(name+"爬了100米,距离终点:"+(sum-(i+1)*100)+"米");
                //try-catch 快捷键  先选中你要处理异常部分
                // ctrl+alt+T
//                try {
//                    Thread.sleep(500);//单位是毫秒   休息0.5秒
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
            System.out.println(name+"已经到达终点");
        },"年轻人");
        Thread t2=new Thread(()->{
            String name=Thread.currentThread().getName();
            int sum=1000;
            for(int i=0;i<10;i++){
                // i==5   本次CPU 放弃了  下一次还可能被选中
                //放弃一次机会
                if(i==5) Thread.yield(); // 第六次不跑了
                System.out.println("第"+(i+1)+"爬山");
                System.out.println(name+"爬了100米,距离终点:"+(sum-(i+1)*100)+"米");

//                try {
//                    Thread.sleep(1000); //每次休息1秒
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
            System.out.println(name+"已经到达终点");
        },"老年人");
        //1-10
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
