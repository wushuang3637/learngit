package day24;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflect {
    @Test
    public void test(){
        try {
            //1.创建class对象
            Class<?> stuClass=Class.forName("day24.Student"); //全类名
            //stuClass就是Student类的 class对象
            String name=stuClass.getName();
            String simpleName=stuClass.getSimpleName();
            System.out.println("类名:"+simpleName);
            System.out.println("全类名:"+name);
            //可以获取类中的所有方法(排除构造 不包含继承的方法)
            Method[]  methods=stuClass.getDeclaredMethods();
            for(Method m:methods){
                System.out.println("方法名:"+m.getName()+
                        "返回值类型:" +m.getReturnType()+
                        "参数列名:"+ Arrays.toString(m.getParameterTypes()));
            }
            System.out.println("-------------------------");
            //可以获取类中的所有方法(排除构造)
            Method[] methods2=stuClass.getMethods();
            for(Method m:methods2){
                System.out.println("方法名:"+m.getName()+
                        "返回值类型:" +m.getReturnType()+
                        "参数列名:"+ Arrays.toString(m.getParameterTypes()));
            }
            //也可以通过反射调用方法   参数: 方法名 和参数类型
            Method m=stuClass.getMethod("updateMoney",int.class);
            //调用方法的意思   m.invoke(对象，参数)
            //m.invoke(stu,100);
            Student stu=(Student)stuClass.newInstance();//创建一个类的对象  调用构造方法
            m.invoke(stu,100);
            System.out.println("========================");
            //获取父类的类对象
            Class<?> superClass=stuClass.getSuperclass();
            Constructor[] cons=stuClass.getConstructors();
            Constructor[] cons2=stuClass.getDeclaredConstructors();
            for(Constructor c:cons2){
                System.out.println("方法名:"+c.getName()+
                        ",参数类型:"+Arrays.toString(c.getParameterTypes()));
            }
            // 获取所有公开的属性   还包括了父类的属性
            //Field[] fs=stuClass.getFields();
            //获取自己的属性    默认 私有 公开的都可以获取
            Field[] fs=stuClass.getDeclaredFields();
            for(Field f:fs){
                System.out.println("名称:"+f.getName()+"类型:"+f.getType());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2(){
        try {
            Class<Student> stuClass=Student.class;
            Student stu=stuClass.newInstance();
            Class<?> stu2Class=stu.getClass(); //也可以获取类对象
            //通过对象来给属性赋值
            Field f=stuClass.getDeclaredField("money");
            //f.set(对象,值);
            //如果修改的是私有属性  需要添加的一个方法setAccessible
            f.setAccessible(true);
            f.set(stu,1000);
            System.out.println(stu.getMoney());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test3(){
        try {
        //java 中获取Class对象的方式? 3种
        //Class<?> class1=Class.forName("全类名");
        Class<Student> class2=Student.class;
        //通过对象调用getClass方法
        Student s=new Student();
        Class<?> class3=s.getClass();
        //反射中如何创建类的对象 有几种方式 2种

        Student stu1= (Student)class3.newInstance(); //只能调用无参的构造
        Constructor con=class3.getConstructor(int.class,String.class,double.class);   //既可以调用有参构造也可以调用无参
        Student stu2= (Student)con.newInstance(100,"张三",9999.55);
        System.out.println(stu1+" "+stu2);


        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4(){
        try {
            People p1=People.getPeople();
            People p2=People.getPeople();
            //People p3=People.class.newInstance();
            Class<People> peopleClass=People.class;
            Constructor con=peopleClass.getDeclaredConstructor();
            con.setAccessible(true);
            People p3= (People) con.newInstance();
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
