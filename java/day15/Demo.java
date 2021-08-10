package day15;

import org.junit.Test;

import java.util.*;

public class Demo {
    @Test
    public void testHashSet(){
        //List<String> list=new ArrayList();
        Set<String> set=new HashSet<>(); //无序  唯一
        set.add("aaa");
        set.add("bbb");
        set.add("aaa");  //替换之前的aaa元素
        set.add("java");
        set.remove("aaa");
        //set.remove(下标)  相比list  set没有下标  无法使用
        set.clear();  //清空集合 list 也有
        boolean b=set.contains("aaa"); //类似于list  判断元素是否存在
        System.out.println(b);
        System.out.println(set.size());
    }
    @Test
    public void testHashSet2(){
        Set<String> set=new HashSet<>();
        set.add("aaa");
        set.add("123");
        set.add("123");
        set.add("456");
        set.add("spring");
        set.add("spring");
        set.add("oracle");
        //set 集合遍历 只有2种  因为没有下标 所以常规for 无法使用
        System.out.println("迭代器遍历");
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("增强for遍历");
        for(String s:set){
            System.out.println(s);
        }

        String s="abc";
        Integer s2=new Integer(96354);
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
    }

    @Test
    public void testTreeSet(){
        //TreeSet:  元素唯一  可以排序
        //针对 基本类型  默认升序
        Set<Integer> set=new TreeSet<>();
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(90);
        set.add(5);
        System.out.println(set);
        //针对String   类似于String.compareTo()
        //先排序第一位 在第二位  三位....  把一位都转换成 ASUII
        Set<String> set2=new TreeSet<>();
        set2.add("zqrt");
        set2.add("abrt");
        set2.add("aaaa");
        set2.add("bvfe");
        set2.add("actd");
        set2.add("1234");
        System.out.println(set2);
        //TreeSet 默认不支持对象排序，当时可以给对象添加比较器对象
        //告诉TreeSet 按照什么规则比较 排序
        //1.Comparable: 一般需要被类实现  然后重写 CompareTo方法
        //方法里面 定义 比较规则
        //2.Comparator
        Set<Card> set3=new TreeSet<>();
        set3.add(new Card("♥10",10));
        set3.add(new Card("♥K",13));
        set3.add(new Card("♥J",11));
        set3.add(new Card("♥Q",12));
        set3.add(new Card("♥A",14));
        System.out.println(set3);
    }
    @Test
    public void testTreeSet2(){
        Set<Card2> set=new TreeSet<>(new com());
        set.add(new Card2("♥10",10));
        set.add(new Card2("♥K",13));
        set.add(new Card2("♣10",10));
        set.add(new Card2("♥J",11));
        set.add(new Card2("♦K",13));
        set.add(new Card2("大王",17));
        set.add(new Card2("小王",16));
        set.add(new Card2("♠K",13));
        set.add(new Card2("♥Q",12));
        set.add(new Card2("♣K",13));
        set.add(new Card2("♥A",14));
        System.out.println(set);
    }
    @Test
    public void testTreeSet3(){
        //外部比较第二种方式 : 匿名内部类
        Set<Card2> set=new TreeSet<>(new Comparator<Card2>(){
            public int compare(Card2 o1, Card2 o2) {
                int result=o1.num-o2.num;
                if(result==0)  result=o1.str.compareTo(o2.str);
                return result;
            }
        });
        set.add(new Card2("♥10",10));
        set.add(new Card2("♥K",13));
        set.add(new Card2("♣10",10));
        set.add(new Card2("♥J",11));
        set.add(new Card2("♦K",13));
        set.add(new Card2("大王",17));
        set.add(new Card2("小王",16));
        set.add(new Card2("♠K",13));
        set.add(new Card2("♥Q",12));
        set.add(new Card2("♣K",13));
        set.add(new Card2("♥A",14));
        System.out.println(set);
    }

    @Test
    public void testTreeSet4(){
        //外部比较第三种方式:  lamdba 表达式
        Set<Card2> set=new TreeSet<>((o1,o2)->{
            int result=o1.num-o2.num;
            if(result==0)  result=o1.str.compareTo(o2.str);
            return result;
        });
        set.add(new Card2("♥10",10));
        set.add(new Card2("♥K",13));
        set.add(new Card2("♣10",10));
        set.add(new Card2("♥J",11));
        set.add(new Card2("♦K",13));
        set.add(new Card2("大王",17));
        set.add(new Card2("小王",16));
        set.add(new Card2("♠K",13));
        set.add(new Card2("♥Q",12));
        set.add(new Card2("♣K",13));
        set.add(new Card2("♥A",14));
        System.out.println(set);
    }
}
