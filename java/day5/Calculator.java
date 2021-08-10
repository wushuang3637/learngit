package day5;

/**
 * //请输入两个数   请输入运算符号
 * // 实现一个四则运算(通过类和对象)
 *
 *         计算器类： 属性 : 数字1  数字2
 *                    方法: 加()  jian() cheng() chu()
 */
public class Calculator {
    //一般情况下  类的属性都要封装(a.属性私有化 b. 提供get/set) 保证属性的安全
    private int num1;
    private int num2;
    byte b;
    short s;
    long l;
    float f;
    double d;
    char ch;
    boolean boo;
    String str="abc";
    //数组 属性
    int[] nums={1,2,3,4,5};
    //对象属性
    Dog dog=new Dog();
    int number=123;
    public void test(int number){  //100
        //局部优先于成员变量   就近原则
        int num1=100;
        //如果局部和成员变量名称相同 如何使用成员变量
        // 表示当前类的属性number 就不是局部变量的number
        this.number=number;
        System.out.println(num1); //100
    }


    public static void main(String[] args) {
        Calculator c=new Calculator();
        //整形变量 默认值都是0
        //浮点型   默认值都是0.0
        //char     默认值是 ''
        //boolean  默认值 是false
        //String、数组、对象  默认值是 null
        System.out.println(c.b);
        System.out.println(c.s);
        System.out.println(c.num1);
        System.out.println(c.l);
        System.out.println(c.f);
        System.out.println(c.d);
        System.out.println(c.ch);
        System.out.println(c.boo);
        System.out.println(c.str);
        System.out.println(c.nums);
        System.out.println(c.dog);
        //c.test();
    }
    /*setXXX() 用于给属性赋值  没有返回值  但是有参数*/
    public void setNum1(int a){
        num1=a;
    }
    public void setNum2(int a){
        num2=a;
    }
    /*getXXX()  用于获取属性值  需要返回值  不需要参数*/
    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }

    //功能方法
    public double jia(){
        return num1+num2;
    }
    public double jian(){
        return num1-num2;
    }
    public double cheng(){
        return num1*num2;
    }
    public double chu(){
        if(num2!=0){
            return num1*1.0/num2;
        }
        //如果不进入if  说明除数是0   返回000000  表示出错
        return 000000;
    }
}
