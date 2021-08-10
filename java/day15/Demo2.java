package day15;

import org.junit.Test;

import java.util.*;

public class Demo2 {
    @Test
    public void testHashMap(){
        List<String> list=new ArrayList<>();
        Set<Card> set=new HashSet<>();
        //一个规定key 的类型
        //一个是规定value类型
        Map<String,String>  map=new HashMap<>();
        //通过 put 存储元素 key-value
        map.put("a","java");
        map.put("abc","c++");
        map.put("a","html");
        map.put(null,"abc");
        //获取value  map.get(key);
        String value=map.get("a");
        Set<String> sets=map.keySet(); //获取map中所有key 的集合
        map.values(); //获取map 中所有value的集合
        System.out.println(map);
        System.out.println("map集合遍历  类似于set  增强for 和迭代器");
        for(String  k:sets){
            String v=map.get(k);
            System.out.println(k+" "+v);
        }
        System.out.println("迭代器遍历");
        //Collection.  set  list
        //map.iterator();
        Iterator<String> it=map.keySet().iterator();
        while(it.hasNext()){
            String key=it.next();
            String v=map.get(key);
            System.out.println(key+" "+v);
        }

    }
}
