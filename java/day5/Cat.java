package day5;

public class Cat {

    //方法：  访问修饰符  返回值类型 名称（参数）
    public String testString(){
        String str="String";
        return str;
    }

    public double testDouble(){
        double d=15.5;
        int i=100;
        double dou=i;
        return i;
    }

    public  double testNumber(int a,double b,String s){
        //test();
        return 0;
    }

    public void test(){
        //实参再传递参数时  一定要符合 形参定义个数和顺序
        testNumber(10,15.5,"sss");
    }
}
