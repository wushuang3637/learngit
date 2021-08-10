package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo3 {
    static int[] nums=new int[10];
    static int index=0;  //数组初始下标
    /*
    * 定义一个长度可变的数组*/
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);


        for(int i=0;i<100;i++){
            //无限存入随机数
            add((int)(Math.random()*100));
        }
        System.out.println("数组的结果:"+ Arrays.toString(nums));
    }

    //向数组插入元素
    public static void add(int number){
        //无限存入元素  当元素个数 超过数组长度80%
        //定义个新数组长度是原来的1.5倍
        nums[index]=number;
        if(index+1>=nums.length*0.8){
            //扩容1.5倍
            int[] newNum=new int[(int)(nums.length*1.5)];
            for(int i=0;i<nums.length;i++){
                newNum[i]=nums[i];
            }
            //nums 指向了新的数组   新数组长度是原来的1.5倍
            nums=newNum;
        }
        index++;


    }
}
