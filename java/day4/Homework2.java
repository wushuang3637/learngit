package day4;

import java.util.Arrays;

/*
e.自定义一个数组,求数组中出现次数超过一半的元素
f.向一个长度为5的整型数组中随机生成5个1-10的随机整数,要求生成的数字中没有重复数
*/
public class Homework2 {
    public static void main(String[] args) {
        /*
        int[] nums={20,30,20,10,20,30,20,30,20,20};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[(nums.length-1)/2]);
        */
        //随机生成长度为5数组 1-10随机数
        int[] nums=new int[10];
        for(int i=0;i<nums.length;i++){
            nums[i]=(int)Math.floor(Math.random()*10+1);
            for(int j=0;j<nums.length;j++){
                //拿生成的元素 和数组其他元素比较
                if(nums[i]==nums[j]&&i!=j){
                    i--;
                    break;   //跳出当前循环
                }
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}
