package day3;

import java.util.Arrays;

public class Demo5 {
    public static void main(String[] args) {
        int a=10;
        int b=100;
        /*1.临时变量
        int temp=a;
        a=b;
        b=temp;
        2.利用加减法:
        a=a+b;
        b=a-b;
        a=a-b;
        3.利用乘除法:
        a=a*b;
        b=a/b;
        a=a/b;
        4. 异或
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+"  "+b);
        */
        /*冒泡排序*/
        int[] nums={5,20,1,90,-20,60};
        for(int i=0;i<nums.length-1;i++){ //控制比较轮数
            for(int j=0;j<nums.length-1-i;j++){ //控制每轮比较的次数
                //两两比较   数组元素和后一个元素去比较  大的再后 小的再前
                if(nums[j]>nums[j+1]){
                    nums[j]=nums[j]^nums[j+1];
                    nums[j+1]=nums[j]^nums[j+1];
                    nums[j]=nums[j]^nums[j+1];
                }
            }
        }
        //Arrays.toString(数组) 将数组的数据转换字符串打印出来
        //开发不会用  只用于测试
        System.out.println(nums); //保存是数组再内存中的地址
        System.out.println(Arrays.toString(nums)); //转换字符串

    }
}
