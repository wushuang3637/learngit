package day9;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import sun.security.smartcardio.SunPCSC;

import java.util.Scanner;

//工厂类
public class FactoryBean {
    //1. 普通工厂模式
    public static Fruit getObject(int a){
        if(a==1){
            //创建对象逻辑  后面会非常复杂
            return getApple();
        }else if(a==2){
            return getOrange();
        }else if(a==3){
            return getBanana();
        }else{
            return null;
        }

    }
    //多工厂模式
    //静态工厂模式
    public static Apple getApple(){
        return new Apple();
    }
    public static Orange getOrange(){
        return new Orange();
    }
    public static Banana getBanana(){
        return new Banana();
    }

}
interface Fruit{
    public void product();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你需要的果汁(1.苹果 2.橙汁 3.香蕉皮)");
        int n=sc.nextInt();
        Fruit f=FactoryBean.getObject(n);
        Apple a=FactoryBean.getApple();
        f.product();
    }
}
class Apple implements Fruit{
    @Override
    public void product() {
        System.out.println("开始生产苹果汁");
    }
}
class Orange implements Fruit{
    @Override
    public void product() {
        System.out.println("开始生产橙汁");
    }
}
class Banana implements Fruit{
    @Override
    public void product() {
        System.out.println("开始生产香蕉皮");
    }
}
