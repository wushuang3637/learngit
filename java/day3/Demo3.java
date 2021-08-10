package day3;

public class Demo3 {
    // main方法快捷键   psvm+tab键
    public static void main(String[] args) {
        // 打印语句快捷键  sout+tab键
        //  \n 表示换行类似于<br>
        //  \t 表示退格  相当于一个tab键的大小
        System.out.print("这是一个打印语句，\n 没有换行功能");
        System.out.print("这是一个打印语句，\t 没有换行功能");
        //声明一个数组   数据类型[]  名称
        //颜色 如果灰色的 表示变量声明了 但是没有使用
        double[] price;
        //5表示  在内存中表示分配一个连续的长度为5的空间
        //数组长度是否可以改?  是 不 可以改的
        double[] price2=new double[5];
        //类型固定的
        double price3[]=new double[]{10,20,30,15.5};
        double[] price4=new double[]{10,20,30,15.5};
        //数组简化版
        double newPrice[]={100,200,300,500};
        // 获取数组元素  数组名[下标]  0~长度-1
        System.out.println(newPrice[0]);
        //System.out.println(newPrice[4]);  //出现数组越界异常


        //数组遍历: 获取数组中每一个元素
        for(int i=0;i<newPrice.length;i++){
            System.out.println(newPrice[i]);
        }
        //增强for 也可以用于遍历数组
        /*  临时变量: 表示数组每次循环出来的数据
        for(数据类型 临时变量: 数组或集合){

        }
         */
        for(double d:newPrice){
            System.out.println(d);
        }
    }
}
