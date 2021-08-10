package day14;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestJunit {
    @Abc
    @Test
    public void a(){
        System.out.println("打印a");
    }
    @Test
    public void test(){
        System.out.println("test");
    }
    @Before
    public  void  aaa(){
        System.out.println("测试方法执行之前的内容");
    }
    @After
    public void bbb(){
        System.out.println("测试方法执行之后的内容");
    }

    public static void main(String[] args) {

    }
}
