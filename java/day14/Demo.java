package day14;

import day13.Person;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

public class Demo {
    @Test
    public void testList1(){
       //1.创建List集合   集合类型   集合名=new  实现类();
        List list=new ArrayList();
        //add  存值  set 替换  get 取值
        list.add(true);
        list.add(123);
        list.add("java");
        list.add(new Person());
        //Object 是java所有类的父类
        list.add(123);
        list.add(true);
        list.add(3,"zhangsan");
        int a=(int)list.get(1);
        int b=(int)list.get(5);
        System.out.println(a+" "+b);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list.set(1,false);
        System.out.println(list.get(1));
   }

   @Test
   public void testList2(){
        Integer[] nums={10,20,30,40,60};
        //将数组的元素存入集合中
        List list2=Arrays.asList(nums);
        //底层实现   内部创建一个Arrays工具类  自己的 静态内部类
       // 也叫ArrayList 该类特殊  没有重写 add  get  remove等方法
       List list=new ArrayList();
       list.add(10);
       list.add(20);
       list.add("abc");
       list.add(50);
       list.add(30);
       list.add("abc");
       list.add(20);
       //IndexOutOfBoundsException  越界异常
       //ArrayIndexOutOfBoundsException 数组越界异常
       //list.remove(20);  //写数字 只会认为按照下标删除
       list.remove("abc"); //写其他类型 会按照元素删除 会删除第一个出现的元素
       list.add(null);
       boolean b=list.remove("abc");
       System.out.println(list+" "+b);
       //判断元素是否存在
       System.out.println(list.contains(20));
       //isEmpty  判断集合是否为空  判断集合元素个数是否是0
       List<Integer>  list4=new ArrayList();
       list4.add(123);
       list4.add(100);
       List<Integer> list3=new ArrayList();
       list3.add(1);
       list3.add(2);
       System.out.println(list3.isEmpty());
       //list1===>list3
       //集合也有工具类  Collections  类似于Arrays
       //集合的父类      Collection
       //Collections.copy(list3,list4);
       //list4 存入list3中   如果长度小于 list4 抛出异常
       //如果不小于    list3.set(下标,list4.get(下标))
       //System.out.println(list4);
       //System.out.println(list3);
       System.out.println("打乱之前"+list);
       //将集合打乱顺序
       Collections.shuffle(list);
       System.out.println("打乱之后:"+list);
       //l.set(i,l.set(j,list.get(i)))
       //l.set(i, l.set(j, l.get(i)));
   }


   @Test
   public void testList3(){
        List list=new ArrayList();
        list.add(100);
        list.add("abc");
        list.add(true);
        list.add(new Person());
        list.add(200);
       System.out.println("常规For遍历");
       for(int i=0;i<list.size();i++){
           System.out.println(list.get(i));
       }
       System.out.println("增强for遍历");
       //由于 类型目前没有固定 不确定集合是什么类型的 所以写object
       for(Object a:list){
           System.out.println(a);
       }
       System.out.println("*****迭代器遍历*****");
       //1.创建迭代器对象  Iterator
       // .iterator();  属于Collection接口的方法
       Iterator it=list.iterator();
       //2. 使用hasNext()  判断   next() 获取
       while(it.hasNext()) {
           Object o=it.next();
           System.out.println(o);
       }
   }
   @Test
    public void testList4(){
        List list1=new ArrayList();
        //list1.add(Object o);
        //list1.get(1);  返回值object
       //添加泛型后    泛型只能写对象类型 不能写基本类型
       List<Integer> list2=new ArrayList();
       //list2.add(Integer n)
       list2.add(1000);
       //可以省略强转
       Integer i=list2.get(1);
       for(Integer n:list2){
           System.out.println(n);
       }

       Iterator<Integer> it=list2.iterator();
       while(it.hasNext()) {
           Integer o = it.next();
           System.out.println(o);
       }

   }

   @Test
    public void testHomeWork(){
       //模拟斗地主  随机发牌   54个
       //3个底牌  +地主     17个
       //2农民    17个
       //保存54张牌  大小王  A~K *4种花色
       List<String> all=new ArrayList<>(); //用于保存所有的牌
       String[] color={"♠","♣","♦","♥"};
       String[] number={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
       for(String c:color){
            for(String n:number){
               all.add(c+n);
            }
       }
       all.add("大王");
       all.add("小王");
       System.out.println("洗牌前:"+all);
       Collections.shuffle(all);
       System.out.println("洗牌后:"+all);
       //地主   2个农
       //54==3   51

    }
    @Test
    public void testLinkedList(){
        List<String> list=new LinkedList<>();
        // list是父类的类型 无法子类自己的方法
        //list.addFirst()
               // addLast()
        //由于链表 适合增删   不是和查找
        LinkedList<String> list2=new LinkedList();
        list2.add("message");  //利用父类List的方法新增
        list2.addFirst("one"); //在第一个节点新增
        list2.addLast("two"); //在是最后一个节点新增
        list2.addFirst("abc");
        list2.addFirst("bcd");
        System.out.println(list2.getFirst());
        list2.removeFirst();
        System.out.println(list2.getFirst());
        System.out.println(list2);
    }
}
