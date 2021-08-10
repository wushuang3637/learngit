package day4;

import java.util.Arrays;

/**
 * 二分查找
 */
public class Demo {
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50,70,80,90,100}; //有序数组
        int number=70;// 目标元素
        int result=-1; //初始定义-1 表示没找到
        //定义初始范围
        int min=0;
        int max=nums.length-1;
        while(min<=max) {
            //计算中间值下标
            int mid = (min + max) / 2;
            if (nums[mid] == number) {
                //mid下标的元素就是number
                result = mid;
                break;
            } else if (nums[mid] > number) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        System.out.println("结果是:"+result);

        //Arrays.binarySearch(有序数组,目标元素)
    }
}
