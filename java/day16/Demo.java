package day16;

import org.junit.Test;

import java.time.LocalDate;
import java.util.*;

public class Demo {
    @Test
    public void testHashTable(){
        Map<Integer,String> map1=new HashMap<>();
        Map<Integer,String> map2=new Hashtable<>();
        map1.put(10,"java");
        map1.put(5,"servlet");
        map1.put(11,"jdbc");
        map1.put(null,"html");
        map1.put(null,null);
        //hashtable  使用方式和HashMap 几乎是一样的
        map2.put(8,"hibernate");
        map2.put(6,"struts2");
        map2.put(7,"springmvc");
        //map2.put(null,"spring");  //运行出错 不允许存储 key  null
        //map2.put(4,null);  //运行出错 不允许存储value null
        System.out.println(map1);
        System.out.println(map2);
        //LocalDate ld=LocalDate.of(2012,10,40);
        System.out.println("遍历Hashtable  通过 增强for  迭代器");
        //map2.get(key);===>value
        for(Integer  key:map2.keySet()){
            String value=map2.get(key);
            System.out.println(key+" "+value);
        }
        System.out.println("迭代器");
        Iterator<Integer> it=map2.keySet().iterator();
        while(it.hasNext()){
            Integer key=it.next();
            String value=map2.get(key);
            System.out.println(key+" "+value);
        }
    }

    @Test
    public void testTreeMap(){
        //支持 基本类型自然排序 默认升序   String  按照位排序
        //对象
        Map<Integer,String> map=new TreeMap<>();
        map.put(10,"aas");
        map.put(15,"aas");
        map.put(3,"aas");
        map.put(6,"aas");
        map.put(8,"aas");
        System.out.println(map);
        Map<String,String> map2=new TreeMap<>();
        map2.put("ddfdf","java");
        map2.put("asdsad","java");
        map2.put("aasdd","java");
        map2.put("3423","java");
        map2.put("ABDDF","java");
        map2.put("VFFDF","java");
        map2.put("dsfgfdgfd","java");
        System.out.println(map2);
        //Map<User,List<Map<Integer,String>>> map3=new TreeMap<>();
        Comparator<User> com=(o1,o2)->{
            return o1.un.compareTo(o2.un);
        };
        Map<User,List<String>> map3=new TreeMap<>(com);
        List<String> list=new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("789");
        map3.put(new User("admin","123"),list);
        List<String> list2=new ArrayList<>();
        list2.add("1234");
        list2.add("4567");
        list2.add("78910");
        map3.put(new User("zhangsan","123"),list2);
        System.out.println(map3);

    }
    @Test
    public  void testObject(){
        //Integer  -128  127   如果超过范围也可以存储
        //相当于每次 new Integer(128)
        Integer num=128;
        Integer num2=128;
        System.out.println(num.equals(num2));
        System.out.println(num==num2);

        Integer nums=new Integer(3105);
        User u=new User();
        String str="ab";
        System.out.println(nums.hashCode());
        System.out.println(u.hashCode());
        System.out.println(str.hashCode());
    }
}
class User{
    String un;
    String pw;
    public User() {
    }
    public User(String un, String pw) {
        this.un = un;
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "User{" +
                "un='" + un + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
}
