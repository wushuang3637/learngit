package day7;

public class Demo3 {
    {
        System.out.println("构造代码块,创建对象时候会执行");
    }
    //所有级别保存的数据
    static Level[] levels=new Level[6];
    static{
        System.out.println("静态代码块,会在类加载的时候执行" +
                ",有且只有一次，将来可以用来给程序的数据做一些初始化工作");
        levels[0]=new Level(1,60,30);
        levels[1]=new Level(2,50,40);
        levels[2]=new Level(3,40,50);
        levels[3]=new Level(4,30,60);
        levels[4]=new Level(5,20,70);
        levels[5]=new Level(6,10,80);

    }
    public void test(){
        {
            System.out.println("普通代码块，调用方法时候会执行");
        }
    }
    public static void main(String[] args) {
//        Demo3 d3=new Demo3();
//        Demo3 d4=new Demo3();
//        Demo3 d5=new Demo3();
//        Demo3 d6=new Demo3();
//
//        System.out.println("ssss");
//
//        d3.test();
    }
}
