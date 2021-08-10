package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {
    /*有一个数组，元素是有序的  手动输入一个元素
       插入数组中  还要保证数组元素的顺序*/
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50,60,80};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您要插入的数据:");
        int number=sc.nextInt();
        //定义长度比原来多1的新数组
        int[] newNum=new int[nums.length+1];
        for(int i=0;i<nums.length;i++) {
            newNum[i] = nums[i];
        }
        //{10,20,30,40,50,60,80,空};
        //通过number 在newNum 找到插入元素下标
        int index=0;
        for(int i=0;i<newNum.length;i++){
            if(number<newNum[i]){  //第一个比number大的元素
                index=i;
                break;
            }
        }
        //{10,20,30,40,50,60,80,空};
        //实现元素后移
        for(int i=newNum.length-1;i>index;i--){
            newNum[i]=newNum[i-1];
        }

        //插入元素
        newNum[index]=number;
        System.out.println("原数组是:"+ Arrays.toString(nums));
        System.out.println("数数组是:"+Arrays.toString(newNum));

        /*数组 不适合做插入 效率比较低
        *      适合做查询
        * */

        /*  ArrayList=10  可以一个长度可变的数组
        *   相当于 定义了新的数组 长度是原来XX倍数
        * */
    }
}
