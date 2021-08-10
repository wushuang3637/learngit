package day7;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("欢迎来到XXXX汽车租赁公司");
        System.out.println("请选择您要租赁天数:");
        int day=sc.nextInt();
        System.out.println("请选择您租赁的类型(1.轿车 2.客车)");
        int n=sc.nextInt();
        String type="";//型号
        int price=0; //日租金
        String card=card();  //调用下面的方法的生成随机车牌号
        TheCar tc=null;  //车的父类
        if(n==1){//轿车
            System.out.println("请选择车型(1.别克商务 2.宝马  3.林荫大道)");
            int num=sc.nextInt();
            switch (num){
                case 1:type="别克商务";price=600; break;
                case 2:type="宝马"; price=500;break;
                case 3:type="林荫大道"; price=300;break;
            }
            tc=new Car(card,type,price,day);
        }else if(n==2){//客车

        }
        tc.print();
   }

    //实现一个随机生成车牌方法  赣AA1234
    public static String card(){
        String init="赣";
        //生成两位随机字母
        //65 -90 随机
        for(int i=0;i<2;i++) {  //"赣AA"
            char c = (char) Math.floor(Math.random() * 26 + 65);
            init+=c;
        }
        for(int i=0;i<4;i++){  //"赣AA0000"
            // 0-9
            init+=(int)(Math.floor(Math.random()*10));
        }
        return init;
    }
}
