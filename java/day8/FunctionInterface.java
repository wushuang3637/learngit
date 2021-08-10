package day8;

import com.sun.org.glassfish.external.amx.MBeanListener;
import day5.Calculator;

//jdk1.8之后 也支持函数式 接口(一般只能写一个抽象方法)
//使用场景: 用于通过lamdba表达式(函数式编程) 只支持函数式接口
public interface FunctionInterface {
    public int sum(int a,int b);
}
class TestLamdba{
    public static void main(String[] args) {
        //通过匿名内部类方式创建出接口对象
//        FunctionInterface f=new FunctionInterface(){
//            public void sum(){
//                System.out.println("求和");
//            }
//        };
//        f.sum();

        //通过lamdba 表达式创建 接口对象
        //FunctionInterface f= (参数)-> 方法实现部分;
        //参数部分可以省略 类型  括号只能有一个参数时可以省略
        //1.  FunctionInterface f=(int a)-> System.out.println("呵呵");
        //2.  FunctionInterface f=( a)-> System.out.println("呵呵");
//       3.  FunctionInterface f= a-> {
//            System.out.println("lamdba实现求和"+a);
//            System.out.println("呵呵");
//            System.out.println("呵呵");
//            System.out.println("呵呵");
//        };
        //4.括号多个参数不能可以省略
//        FunctionInterface f=(a,b,str)->{
//            String result=a+b+str;
//            System.out.println(result);
//        };
        //5.  如果函数式接口方法 有返回值
        // 如果方法实现部分只有一行代码,并且这行代码的结果就是返回值
        //{}  return 都可以不要  如果有两行代码 那么 他们都不能省略
        FunctionInterface f=(a,b)->a+b;
        int result=f.sum(100,200);
        System.out.println(result);
    }
}
