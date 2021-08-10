package day13;
//自定义的异常类
public class SexException  extends  RuntimeException{
    //定义构造方法
    public SexException(){}
    public SexException(String message){
        super(message);  //存入异常名称
        //也可以写一些 自定义的功能
        //比如:   通过异常类型判断  是否符合权限
        //如果不符合  可以调转到 没有权限的页面
    }
}
