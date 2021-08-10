package day11;

public class Test2 {
    public static void main(String[] args) {
        int n=10;// 空瓶
        int num=10;//  总共啤酒数
        while(n>1){
            num+=n/2;
            n=n/2+n%2;
        }
        System.out.print(num);
    }
}
