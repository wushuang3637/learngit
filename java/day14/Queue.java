package day14;

import org.junit.Test;

import java.util.LinkedList;

/*
模拟队列： 特点 先进 先出
3 2 1
3  2 ==> 1
3  ==>2
 */
public class Queue{
    LinkedList<String> list=new LinkedList();
    public void  add(String s){
        list.addFirst(s);
    }
    public String get(){
        String s=list.getLast();
        list.removeLast();
        return s;
    }
    @Test
    public void test(){
        add("a");
        add("b");
        add("c");
        add("d");
        System.out.println(list);
        System.out.println("***存储结束****");
        System.out.println(get());
        System.out.println(get());
        System.out.println(get());
        System.out.println(get());
    }
}
