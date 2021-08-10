package day7;

public class TheCar { //汽车
    String card;  //车牌号
    String type;  //车型
    double price; //日租金
    int day;//租赁天数
    public void print(){
        System.out.println("车牌号:"+card);
        System.out.println("车型:"+type);
        System.out.println("日租金:"+price);
        System.out.println("您需要支付租赁费用:"+price*day);
    }
}
class Car extends TheCar{ //轿车
    public Car(){}
    public Car(String card,String type,double price,int day){
        //this  自己当前类的资源   super 自己父类的资源
        super.card=card;
        super.type=type;
        super.price=price;
        super.day=day;
    }
}
class Bus extends TheCar{  //客车
    public Bus(){}
    public Bus(String card,String type,double price,int day){
        //this  自己当前类的资源   super 自己父类的资源
        super.card=card;
        super.type=type;
        super.price=price;
        super.day=day;
    }
}
