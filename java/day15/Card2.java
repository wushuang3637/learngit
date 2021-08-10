package day15;

import java.util.Comparator;

//牌类
public class Card2{
    String str; //存储牌的内容
    int num;// 存储牌的对应的值
    public Card2(){}
    public Card2(String str, int num) {
        this.str = str;
        this.num = num;
    }
    @Override
    public String toString() {
        return str;
    }
}
//外部比较第一种实现方式: 单独定义一个类  实现接口
class com implements Comparator<Card2>{
    //实现它的比较规则
    //  o1和o2相减   结果>0   o1排在o2后面    结果<0 相反
    // 如果等于=0   由于通过TreeSet 使用它  set保证元素唯一
    // set任意你们是同一个元素    按照小-大的顺序
    //  o2-o1相减  可以实现 大--小顺序
    public int compare(Card2 o1, Card2 o2) {
        //假设 我们♥K  ♦K  ♣K  ♠K    num值一样的  set会去重
        //所以需要多加规则   可以先按照num比较
        // 当num相同时  再按照String比较排序花色
        int result=o1.num-o2.num;
        if(result==0){
            result=o1.str.compareTo(o2.str);
        }
        return result;
    }
}

