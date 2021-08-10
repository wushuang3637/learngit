package day4;

import java.util.Arrays;

/*
基础
a. 冒泡排序、选择排序、插入排序 重新练习一遍
b. 今日手写代码  冒泡排序、选择排序
c. 自定义一个整形数组，求出数组元素的奇数和，偶数和，最大值和最小值
d.自定义一个长度为10的整形数组，将数组最大值保存在数组第1位(提示最大值和第一位互换)
选做题
e.自定义一个数组,求数组中出现次数超过一半的元素
f.向一个长度为5的整型数组中随机生成5个1-10的随机整数,要求生成的数字中没有重复数
 */
public class Homework1 {
    public static void main(String[] args) {
        //int[] nums={80,50,10,-20,70,60};
        /*冒泡排序
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    //值得互换
                    nums[j]=nums[j]^nums[j+1];
                    nums[j+1]=nums[j]^nums[j+1];
                    nums[j]=nums[j]^nums[j+1];
                }
            }
        }
        选择排序:

        for(int i=0;i<nums.length-1;i++){
            for(int j=i;j<nums.length-1;j++){
                if(nums[i]>nums[j+1]){
                    //值得互换
                    nums[i]=nums[i]*nums[j+1];
                    nums[j+1]=nums[i]/nums[j+1];
                    nums[i]=nums[i]/nums[j+1];
                }
            }
        }
        {80,50,10,-20,70,60};
        插入排序:   分两个部分 : 有序部分 和 待插入部分
         80  有序部分    50 待插入部分
         50 80
         50 80  有序     10 待插入
         50 10 80
         10 50 80   -20
         .....

        for(int  i=1;i<nums.length;i++){  // 每次带插入的元素
            for(int j=i;j>0;j--){
                if(nums[j-1]>nums[j]){
                    //值得互换
                    nums[j]=nums[j]+nums[j-1];
                    nums[j-1]=nums[j]-nums[j-1];
                    nums[j]=nums[j]-nums[j-1];
                }
            }
        }
        System.out.println(Arrays.toString(nums));
         */
        //变量声明了没有初始化  不能使用
        //int[] nums={80,50,10,-20,70,60,77,65,20,11};
        /*
        int min=nums[0];
        int max=nums[0];
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
            if(max<nums[i]){
                max=nums[i];
            }

            if(nums[i] %2 ==0){
                sum2+=nums[i];
            }else{
                sum1+=nums[i];
            }
        }
        System.out.println(min+" "+max+" "+sum1+" "+sum2);
        */
        int[] nums={80,50,10,-20,70,60,177,65,20,11};
        //最大值元素 和 第一个元素互换位置
        int index=0; //表示最大值的下标
        int max=nums[0];
        for (int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
        }
        int temp=nums[index];
        nums[index]=nums[0];
        nums[0]=temp;
        System.out.println(Arrays.toString(nums));
    }
}
