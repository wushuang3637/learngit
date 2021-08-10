package day5;

import java.util.Scanner;

/*狗类：静态特征: 颜色  年龄  名称  品种  属性
*       动态特征: 吃饭  玩    咬人        方法*/
public class Dog {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.name="sss";
        d.setAge(111);
    }
    //属性:  在类的里面 方法外面定义的变量  也叫成员变量
   //访问修饰符  数据类型  变量名;
    //private表示私有属性   属性只能本类使用
   int age;  //年龄
   private String name;//姓名
   private String color;// 颜色
   private String type;// 品种
    //公开的  范围是最大的
    // 定义一个方法 专门给age属性赋值  setXXX()
    void  setAge(int a){
        //可以编写 age赋值的规则  1-100
        if(a>1 && a<100){
            age=a;
        }else{
            System.out.println("您输入的年龄有问题");
        }
    }
    // 定义一个方法 用于获取age属性值   getXXX()
    //    int表示 方法执行结束 有一个int 返回
    public int getAge(){
        return age;
    }

    //方法:
    public void eat(){
        System.out.println("狗狗开始吃骨头");
    }
    //打印自我介绍
    public void print(){
        System.out.println("我是一只:"+type+",我的名字是:"+name
        +"，我的年龄是:"+age);
    }




}
