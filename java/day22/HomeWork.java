package day22;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
统计一个文件testIO.txt  中各个字母出现次数：
     * A(8),B(16),C(10)...,a(12),b(10),c(3)....，括号内
     代表字符出现次数;
      统计结束后写入到一个result.txt中显示结果
 */
public class HomeWork {
    public static void main(String[] args) throws IOException {
        File f=new File("d://io//testIO.txt");
        FileInputStream fis=new FileInputStream(f);
        FileOutputStream fos=new FileOutputStream("d://io//result.txt");
        Map<String,Integer> map=new TreeMap<>();
        for(int i=0;i<f.length();i++) {
            String key=(char)fis.read()+"";
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }
        for(String k:map.keySet()){
                   // A  (   10   )
            fos.write((k+"("+map.get(k)+")").getBytes());
        }
        fis.close();
        fos.close();
    }
}
