package day5;

public class Test {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);

        //数组  二分查找:   有序数组   折半查找
//        int[] nums={20,30,70,90,120};
//        int min=0;
//        int max=nums.length-1;
//        int number=30;
//        while(min<=max) {
//            int mid = (min + max) / 2;
//            if (nums[mid] > number) {
//                max = mid - 1;
//            } else if (nums[mid] < number) {
//                min = mid + 1;
//            } else {
//                System.out.println("结果是:" + mid);
//                break;
//            }
//        }

        //一维数组   int[] sss={1,2,3,4,5};
        //  String[]  str={"aaa","bbb","ccc"};
        //多维数组:  数组中的元素是其他数组

        //二维:
        int[][] nums={{1,2,3},{4,5,6},{7,8},{10,20},{30}};
        //三维:
        int[][][] nums2={{{1,2},{3,4},{5,6}},{{7},{8}}};

        //遍历二维数组
        /*
        for(int i=0;i<nums.length;i++){
            //nums[i]//不是值  而是数组
            for(int j=0;j<nums[i].length;j++){
                System.out.println(nums[i][j]);
            }
        }*/
        int[][] nums3={{1,2,3},{4,5,6},{7,8},{10,20},{30}};

        //增强for 如何遍历二维数组
        for(int[]  a: nums3){
            //a 每循环一次  获取一个元素 这个元素是又是一个数组
            for(int i:a){
                System.out.println(i);
            }
        }

        int[][] newNum=new int[3][2];
        newNum[0][0]=100;
        newNum[0][1]=200;
        newNum[2][2]=200;


        Dog d=new Dog();
        //d.属性  d.方法()
        //d.name="sss";
        d.age=121;



    }
}
