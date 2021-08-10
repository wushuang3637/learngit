package day22;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/*
3.通过复制文件的原理:  实现复制整个目录的文件
 */
public class HomeWork2 {
    static String old;
    static String news;
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要复制的目录:(格式-盘符:\\目录)");
        old=sc.next();  //  d:aaa  === d://aaa//a.txt
        System.out.println("请输入要粘贴的目录:(格式-盘符:\\目录)");
        news=sc.next();  // d:bbb  ===d://bbb//a.txt
        long begin=System.currentTimeMillis();
        show(new File(old));
        long end=System.currentTimeMillis();
        System.out.println("复制成功,总共耗时"+(end-begin)+"毫秒");
    }
    //展示文件里面目录的方法
    public static void show(File file) throws IOException {
        File[] files=file.listFiles();
        if(files==null){//file 是文件
            File out=new File(file.getAbsolutePath().replace(old,news));
            File outParent=out.getParentFile();
            if(!outParent.exists()){
                outParent.mkdirs();
                System.out.println("创建目录成功:"+outParent.getAbsolutePath());
            }
            copy(file,out);
        }else if(files.length==0){ // old是目录  是空目录
                // d:/aaa/java/abc===>d:/bbb/java/abc
           String newPath=file.getAbsolutePath().replace(old,news);
           File f=new File(newPath);
           if(!f.exists()){
               f.mkdirs();
               System.out.println("创建空目录成功:"+f.getAbsolutePath());
           }
        }else{// file 是目录 存在子文件或者子目录
            for(File f:files){ // f 也可能会有old的过程
                show(f);
            }
        }
    }
    public static void copy(File in,File out) throws IOException {
        FileInputStream fis=new FileInputStream(in);
        FileOutputStream fos=new FileOutputStream(out);
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        byte[] b=new byte[1024];
        int len=0;
        while((len=bis.read(b))!=-1){
            bos.write(b,0,len);
        }
        System.out.println("复制文件成功:"+out.getAbsolutePath());
        bis.close();
        bos.close();
        fis.close();
        fos.close();
    }

    @Test
    public void test(){

    }
}
