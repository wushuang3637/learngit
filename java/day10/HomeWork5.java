package day10;
/*
给定一个由数字组成的字符串,
如:"1239586838923173478943890234092",
统计出每个数字出现的次数
 */
public class HomeWork5 {
    public static void main(String[] args) {
        String nums="1239586838923173478943890234092";
        //统计每个数字出现的次数
        int[] results=new int[10];
        for(int i=0;i<nums.length();i++){
            char ch=nums.charAt(i);  //1 ==>48-57 表示数字
            int num=ch-48;
            results[num]++;
        }
        System.out.println("结果是:");
        for(int i=0;i<results.length;i++){
            System.out.println(i+"出现的次数:"+results[i]);
        }

    }
}
