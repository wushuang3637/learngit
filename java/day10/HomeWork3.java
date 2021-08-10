package day10;

import java.util.Scanner;

/*
给定一个字符串,判断该字符串中是否包含
某个子串.如果包含,求出子串的所有出现位置.
 */
public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个任意字符串:");
        String  str=sc.next();
        System.out.println("请输入您要查找的字符:");
        String  search=sc.next();
        for(int i=0;i<str.length();i++) {
            int n=str.indexOf(search,i);
            if(n==-1&&i==0){
                System.out.println(n);
                break;
            }else if(n==-1){
                break;
            }else{
                System.out.print(n+" ");
                i=n;
            }
        }
    }
}
