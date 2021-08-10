package day15;

import org.junit.Test;

import java.util.*;

//“abc”，“123”，“java”，“mysql”，“别跑啊”
public class HomeWork1 {
    @Test
    public void test1(){
        List<String> list=new ArrayList<>();
        list.add("abc");
        list.add("123");
        list.add("java");
        list.add("a");
        list.add("ab");
        list.add("mysql");
        list.add("别跑啊");
        for(int i=0;i<list.size();i++){
            while(list.get(i).length()<4){
                list.set(i,0+list.get(i));
            }
        }
        System.out.println(list);
    }
    @Test
    public void test2(){
        List<Card2> all=new ArrayList<>(); //用于保存所有的牌
        String[] color={"♠","♣","♦","♥"};
        String[] number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for(String c:color){
            for(int i=0;i<number.length;i++){
                all.add(new Card2(c+number[i],i+3));
            }
        }
        all.add(new Card2("大王",17));
        all.add(new Card2("小王",16));
        System.out.println("洗牌前:"+all);
        Collections.shuffle(all);
        System.out.println("洗牌后:"+all);
        Comparator<Card2> com=(o1,o2)->{
            int result=o1.num-o2.num;
            if(result==0) result=o1.str.compareTo(o2.str);
            return result;
        };
        Set<Card2> landlord=new TreeSet<>(com);
        Set<Card2> farmer1=new TreeSet<>(com);
        Set<Card2> farmer2=new TreeSet<>(com);
        //先将底牌给地主
        System.out.print("地主的底牌:");
        for(int i=0;i<3;i++){
            //先要删除 第一个元素 并且会返回删除的元素内容
            System.out.print(all.get(0)+" ");
            landlord.add(all.remove(0));
        }
        System.out.println();
        System.out.println("开始发牌");
        while(!all.isEmpty()){
            farmer1.add(all.remove(0));
            farmer2.add(all.remove(0));
            landlord.add(all.remove(0));
        }
        System.out.println("农民1:"+farmer1);
        System.out.println("农民2:"+farmer2);
        System.out.println("地主:"+landlord);

    }
}
