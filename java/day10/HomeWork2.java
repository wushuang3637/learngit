package day10;
/*
* String s="name=zhangsan  age=18  classNo=090728";
将上面的字符串拆分，结果如下:
zhangsan 18  090728
* */
public class HomeWork2 {
    public static void main(String[] args) {
        String s="name=zhangsan  age=18  classNo=090728";

        String[] strs=s.split("  ");
        for(int i=0;i<strs.length;i++){
            String str=strs[i].split("=")[1];
            System.out.println(str);
        }
    }
}
