package day3;

import java.util.Arrays;

public class Demo6 {
    public static void main(String[] args) {
        /*选择排序
        int nums[]={50,-20,-100,30,10};
        for(int i=0;i<nums.length-1;i++){//控制轮数
            for(int j=i;j<nums.length-1;j++){
                if(nums[i]>nums[j+1]){
                   nums[i]=nums[i]+nums[j+1];
                   nums[j+1]=nums[i]-nums[j+1];
                   nums[i]=nums[i]-nums[j+1];
                }
            }
        }
        System.out.println(Arrays.toString(nums));

        插入排序:
        */
        int nums[]={50,-20,-100,30,10};
        for (int i=1;i<nums.length;i++){
            for(int j=i;j>0;j--){
                if(nums[j]<nums[j-1]){
                    nums[j]=nums[j]*nums[j-1];
                    nums[j-1]=nums[j]/nums[j-1];
                    nums[j]=nums[j]/nums[j-1];
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
