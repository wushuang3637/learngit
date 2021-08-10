package day3;
//表示 导入了 java.util.所有内容
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class Demo2 {
    public static void main(String[] args){
        //1.创建scanner对象  参数表示  字节输入流 可以读取控制台数据
        Scanner sc=new Scanner(System.in);
        //获取一个字符串单词 空格隔开了 后面的字符是下一个单词
        //String aa=sc.next();
        //String aa2=sc.next();
        //如果想获取带空格的字符串
        //String line1=sc.nextLine();
        //String line2=sc.nextLine();
        //System.out.println(line1+" "+line2);
        System.out.println("请输入一个您的选择编号:1.登录 2.注册");
        //为了防止输入数据出现问题(类型不一致的问题)
        //可以通过scanner对象的方法 hasXX()  来判断
        //sc.hasNextInt();  //判断输入是否是整型
        //sc.hasNextDouble(); //判断输入的是否是浮点型
        //sc.hasNext();   用的很少
//        if(sc.hasNextInt()){
//            int num=sc.nextInt();
//            System.out.println(num);
//        }else{
//            System.out.println("您输入的不是整数");
//        }


        //日期格式化对象 SimpleDateFormat
        Date d1=new Date();
        System.out.println(d1);
        //这种删除线 不是错误 而是Java认为不推荐使用
        // 因为有更好的方式
        int month=d1.getMonth();
        int year=d1.getYear();
        //年 月 日 时分秒
        System.out.println(year+" "+month);
        //推荐使用这种方式  类似于Scanner写法            2020/10/20 15:30:40
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a");
//        Scanner sc2=new Scanner(System.in);
//        int n=100;
        //通过sdf 格式化日期对象
        String time=sdf.format(d1);
        System.out.println(time);
        //创建数字格式化对象 并且制定格式化的格式
        DecimalFormat df=new DecimalFormat("#,###.00");
        //将数字进行格式化  返回String的结果
        String result=df.format(123543545454545.436343);
        System.out.println(result);

        for(;;){
            System.out.println("循环");
        }
    }
}
