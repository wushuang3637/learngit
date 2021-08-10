package day10;

import java.util.Arrays;

/*
给定一个长度,随机产生一个该长度的字符串,
由大写,小写字母以及数字组成
 */
public class Homework4 {
    public static void main(String[] args) {
        int length=20;
        String str="";
        for(int i=0;i<length;i++) {
            //1-62随机数  1-10 描述数字  11~36 描述字母  37~62 大写字母
            int a = (int) (Math.random() * 62 + 1);
            //97-122 a-z   65-90 A-Z    48-57  0-9
            if(a<=10){  //描述数字  1-10 +=47===>48~57
                a+=47;
            }else if(a<=36){//小写  11-36+=86 ==> 97~122
                a+=86;
            }else{//大写  37-62+=28===>65~90
                a+=28;
            }
            str+=(char)a;
        }
        System.out.println("随机字符串是:"+str);
    }
}
