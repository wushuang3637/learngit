package day24;

public class Student{
    int num;
    String name;
    private static double money;
    public double getMoney() {
        return money;
    }
    public Student() {
        //super()
        System.out.println("调用了无参构造");
    }
    public Student(int num, String name, double money) {
        this.num = num;
        this.name = name;
        this.money = money;
    }
    public static void updateMoney(int num){
        money+=num;
        System.out.println("别人给我转账了"+num+"元");
    }
    public String getMessage(){
        return num+" "+name+" "+money;
    }
}
