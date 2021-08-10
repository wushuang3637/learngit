package day3;

import java.util.Arrays;
import java.util.Comparator;

public class Demo4 {
    public static void main(String[] args) {
        int[] nums={50,30,10,20,70,40};
        Integer[] nums2={50,30,10,20,70,40};

        //通过工具类将数组做排序  Arrays
        //包含了针对数组的排序和算法功能
        //进行默认升序排列（小---大）
        /*
        Arrays.sort(nums);
        //遍历数组
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        } */
        //进行降序排列(大---小)
        //比较器对象  Comparator   泛型表示规定存放什么类型的数据
        //new Comparator<泛型>()
        Comparator com=new Comparator<Integer>(){
            //实现的比较规则
            //o1和o2 两值直接的大小来决定是升序是降序
            //o1-o2 升序    o2-o1降序
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };
        Arrays.sort(nums2,com);

        for(int i=0;i<nums2.length;i++){
            System.out.println(nums2[i]);
        }
    }
}
