package day8;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public abstract class TestScanner   {
    //public void test(){  //无法重写(覆盖)}
    public static final String TYPE="管理员";
    public static final String DIS_STATUS="禁用";
    public static final String ABL_STATUS="启用";
    public void testFinal(){
        //TYPE="ssss";  //常量一旦赋值不能修改
    }
    public TestScanner(){

    }
    //public abstract  void test();
}
class TestError extends  Error{
    public final  void test(){  //最终方法
        String type=TestScanner.TYPE;
        TestScanner ts=new TestScanner() {};
    }
}
