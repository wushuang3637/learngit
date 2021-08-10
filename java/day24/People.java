package day24;

public class People {
    //单例模式  饿汉式和懒汉式   可以通过反射创建新的对象
   private People(){}
   private static People p=new People();
   public static People getPeople(){
       return p;
   }
}
