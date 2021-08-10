package day10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Demo {
    static User u;
    static Goods[] gs;
    static Scanner sc=new Scanner(System.in);
    static{ //会在类加载执行  做一些数据初始化
        u=new User("tom","123");
        gs=new Goods[5];
        gs[0]=new Goods(10,"电风扇",124.23);
        gs[1]=new Goods(20,"洗衣机",4500.0);
        gs[2]=new Goods(30,"电视机",8800.9);
        gs[3]=new Goods(40,"冰箱",5000.88);
        gs[4]=new Goods(50,"空调机",4456.0);
    }
    public static void main(String[] args) {
       // 指定登录  登录成功
        boolean b=login();
        if(b) {
            //展示商品信息  批发商品
            show();
        }
        System.out.println("退出程序");
    }
    public static boolean login(){ //登录功能
        boolean b=false;
        for(int i=0;i<3;i++) {
            System.out.println("请输入您的账号:");
            String un = sc.next();
            System.out.println("请输入您的密码:");
            String pw = sc.next();
            if (un.equals(u.username) && pw.equals(u.password)) {
                b=true; break;
            }else{
                System.out.println("您第"+(i+1)+"次账号和密码输入错误");
                if(i==2) System.out.println("您累计错误3次,结束程序");
            }
        }
        return b;
    }

    public static void show() {  //展示商品 并且批发商品
        System.out.println("*****欢迎进入XXX批发商城*****");
        System.out.println("\t\t编号\t商品名称\t商品价格");
        for (int i = 0; i < gs.length; i++) {
            System.out.println("\t\t" + gs[i].num + "\t\t" + gs[i].name + "\t\t" + change(gs[i].price));
        }
        System.out.println("****************************");
        System.out.println("请输入您购买的商品编号");
        int n=sc.nextInt();
        Goods goods=null;
        for(int i=0;i<gs.length;i++){
            if(n==gs[i].num){
                goods=gs[i];
                break;
            }
        }
        System.out.println("请输入批发商品数量:");
        int number=sc.nextInt();
        System.out.println("您购买商品信息:编号:"+goods.num+" 名称:"+goods.name+" 单价:"+change(goods.price));
        System.out.println("你需要付款金额:"+change(goods.price*number));
    }
    //格式化数字方法
    public static String change(double d){
        StringBuilder sb=new StringBuilder(d+"");
        //1 234 567.123
        for(int i=sb.indexOf(".")-3;i>0;i-=3){
            sb.insert(i,",");
        }
        return sb.toString();
    }
}
class User{
    //用户类
    String username; //用户名
    String password; //密码
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public User(){}
}
class Goods{
    //商品类
    int num;    //编号
    String name; //名称
    double price;  //价格
    public Goods(int num, String name, double price) {
        this.num = num;
        this.name = name;
        this.price = price;
    }
    public  Goods(){}
}
