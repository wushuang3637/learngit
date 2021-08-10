package day6;
//一个java 文件可以写很多个class 类
//公开类 只有一个
//如果有多个class编译过后  也会生成多个.class文件
public class Dog {
    String name;
    String color;
    String type; //品种
    int love; //友好度
    int health;//健康值
    //构造方法 如果类中没有定义  本身会存在一个默认无参构造
    //  如果类中定义了   默认提供的就失效
    //  所以为了防止出现问题  提供了有参构造 也要无参构造

    //规定: 访问修饰符  类名(){   }
    //作用： 创建对象    可以给属性赋值
    //构造方法 可以很多个   也可以相互调用
    //  this.属性名    this.方法名()   调用当前类的普通方法
    // this()  调用当前类无参构造
    //  this(参数)  调用当前类有参构造

    private  Dog(){  //无参构造
        //不能随便写 只能在构造方法中编写
        // 必须写在构造方法中的第一行
        this(100);
        System.out.println("执行了无参构造方法");
       // this(100);  错误的
    }
    private  Dog(int a){  //有参构造
        this(10,20);
        System.out.println("有一个参数构造");
    }
    private  Dog(int a,int b){  //有参构造
        System.out.println("有两个参数构造");
    }
    public void test(){
        //this();  错误的
    }
    //通过有参构造给属性赋初值
    public Dog(String name,String color,String type,int love,int health){
        this.name=name;
        this.color=color;
        this.type=type;
        this.love=love;
        this.health=health;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", love=" + love +
                ", health=" + health +
                '}';
    }

    public static void main(String[] args) {
//        Dog  d=new Dog();
//        new Dog(10,20);
//        new Dog(100);
//        new Dog();
//        Dog d2=new Dog("小二","白色","哈士奇",50,50);
//        System.out.println(d2);
        new Dog();
    }
}
class  A{
    public static void main(String[] args) {
        //Dog d=new Dog();
        // boolean表达式？值1:值2
        int a=30;
        int b=20;
        System.out.println(a>b?100:200);

    }
}
class B{
    //方法重载 ：方法名一致    参数不一致  返回值无关
    public void test(){
        System.out.println("无惨");
    }
    public void test(String str){
        System.out.println("一个参数");
    }
    public String test(int a){
        return "";
    }
}