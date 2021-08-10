package day9;

import java.util.Arrays;

public class TestString {
    public static void main(String[] args) {
        String str="this is java";
        //1.concat() 拼接字符串   类似于+ 拼接
        str=str.concat(".jpg");  // "this is javaabc";
        System.out.println(str);

        //2. startWith  endWith  判断前缀 后缀
        boolean b=str.endsWith(".jpg");
        System.out.println(b);
        //判断地址是否 以指定内容开头
        str="https://".concat(str);
        boolean b2=str.startsWith("https://");
        System.out.println(b2);

        //3.getBytes()    toCharArray()   转换字节和字符数组
        //I/O流  读写数据时 会使用
        String str2="abcd数据中国abc";
        //中文不同的编码方式  GBK  一个汉字占3个字节
        // UTF-8 一个汉字2个字节
        byte[] bs=str2.getBytes();
        char[] chs=str2.toCharArray();
        for(byte by:bs){
            System.out.println((char)by);
        }
        System.out.println(Arrays.toString(chs));

        //4. contains  用于判断指定字符是否存在 类似于indexof
        //             返回  boolean
        boolean b3=str2.contains("中国");
        System.out.println(b3);

        //5. replace()   替换全部字符串
        // replaceAll()  替换全部字符串   支持正则表达式
        // replaceFirst()   替换第一个指定字符
        String str3="java script java html oracle java spring";
        //str3=str3.replace("java","@@");
        //str3=str3.replaceAll("java","@@");
        str3=str3.replaceFirst("java","@@");
        System.out.println(str3);
    }
}
