package day13;

import java.util.Scanner;

public class Person {
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age>0 && age<100)  this.age = age;
        else   throw new AgeException("年龄只能是1-100之间");//抛出自定义异常
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您年龄:");
        int age=sc.nextInt();
        Person p=new Person();
        p.setAge(age);
    }
}
