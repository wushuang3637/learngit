package day22;

import java.io.InvalidClassException;
import java.io.Serializable;
/*
实现序列化对象有很多前提 需要实现一个序列化接口，
只是用于标记该类可以被序列化  没有任何功能 如果没有实现
出异常 NotSerializableException
实现序列化有一个隐式属性 UID  (unique id)  如果序列化和反序列化
两者的uid不一致 会出现异常   InvalidClassException
 */
public class Student implements Serializable {
    //定义个固定的UID;
    private static final long serialVersionUID=435345353454554L;
    /*
   序列化的时候 几种特殊情况 不会被序列化
   1. static 静态的资源不会序列化
   2. transient  表示忽略   也不会序列化
     */
    private Integer id;
    private static String name;
    private transient int age;
    public Student() {
    }
    public Student(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
}
