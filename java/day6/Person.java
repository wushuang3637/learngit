package day6;

/**
 * 2.编写 Java 程序员用于显示人的姓名和年龄。定义一个人类Person。
 * 该类中应该有两个私有属性： 姓名 （name） 和年龄 （age） 。定义
 * 构造方法用来初始化数据成员。再定义显示（display()） 方法将姓名
 * 和年龄打印出来。在 main 方法中创建人类的实例然后将信息显示
 */
public class Person {
    private String name;
    private int age;
    //快捷键生成 get/set   alt+insert键


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display(){
        System.out.println(name+" "+age);
    }
    /* 把对象 引用地址 转化成 字符串形式打印出来
    *  这里打印规则可以手动编写
    * */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person p=new Person();
        System.out.println(p);
    }
}
