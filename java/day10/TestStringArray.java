package day10;

import java.util.Arrays;

public class TestStringArray {
    public static void main(String[] args) {
        String[] str={"aaa","z","bcd","abc","efg","111","112","123","321","ABC","AAA","ABD"};
        //char[] chs={'b','c','a','s','z','g'};
        System.out.println("排序前:"+ Arrays.toString(str));
        //String 排序  比较
        for(int i=0;i<str.length-1;i++){
            for(int j=0;j<str.length-1-i;j++){
                //通过String 方法实现比较   compareTo()
                //比较规则  字符串每个字符取出来 通过asuii 相减
                // a-b>0  a 和b 需要掉换位置
                if(str[j].compareTo(str[j+1])>0){
                    String temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
        System.out.println("排序后:"+ Arrays.toString(str));
    }
}
