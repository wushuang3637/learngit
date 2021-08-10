package day13;

public class Demo5 {
    public static void main(String[] args) {
        try {   //尝试
            int[][] nums = new int[2][5];
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    System.out.println(nums[i][j]);
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){  // 捕获
            e.printStackTrace();
        }finally {// 无论是否发生异常都会执行
            System.out.println("执行finally代码块， 做一些收尾工作 关闭资源 释放资源 ");
        }



       try{

       }catch (Exception e){

       }

       try{

       }finally {

       }


    }
}
