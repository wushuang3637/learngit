package day22;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TestObject {
    //反序列化
    @Test
    public void input() throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("d://io//student.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student stu=(Student)ois.readObject();
        System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getAge());
        ois.close();
        fis.close();
    }
    //序列化
    @Test
    public void output() throws IOException {
        FileOutputStream fos=new FileOutputStream("d://io//student.txt");
        //传入个参数:字节输出流 OutputStream
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Student stu=new Student(110,"刘剑涛",99);
        oos.writeObject(stu);
        oos.close();
        fos.close();
    }

    @Test
    public void output2() throws IOException {
        FileOutputStream fos=new FileOutputStream("d://io//output.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        List<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        oos.writeObject(list);
        oos.close();
        fos.close();
    }
    @Test
    public void input2() throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("d://io//output.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        List<Integer> list=(List<Integer>) ois.readObject();
        System.out.println(list);
        ois.close();
        fis.close();
    }
}
