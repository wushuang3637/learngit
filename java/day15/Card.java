package day15;
//牌类
//内部比较 Comparable
public class Card  implements  Comparable<Card>{
    String str; //存储牌的内容
    int num;// 存储牌的对应的值
    public Card(){}
    public Card(String str, int num) {
        this.str = str;
        this.num = num;
    }
    @Override
    public String toString() {
        return str;
    }
    //自定义比较规则
    public int compareTo(Card o) {
        //根据对象里面num值 当做比较规则@
       return  this.num -o.num;
    }

}

