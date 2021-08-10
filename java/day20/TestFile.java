package day20;
import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        //创建File对象    路径   如果只写a.txt   在项目工作空间目录下去找a.txt
        File f=new File("d:\\a\\b\\c");
        boolean isExists=f.exists();//判断文件或者目录是否存在
        if(isExists){
            System.out.println("目录或文件存在的");
        }else{
            System.out.println("目录或文件不存在");
            //如果目录不存在   可以创建目录  mkdir  mkdirs()
            //mkdir: 都是创建目录  如果目录父级不存在 则创建失败
            //mkdirs: 都是创建目录 如果目录父级不存在 会逐级创建
            boolean b=f.mkdirs();
            if(b) System.out.println("创建成功");
            else System.out.println("创建失败");
        }
        //判断是否是文件 isFile()  是否是目录  isDirectory()
        System.out.println("是否是文件:"+f.isFile());
        System.out.println("是否是目录:"+f.isDirectory());
        //删除文件   delete()  只能删除空的目录 或者文件
        // 所以只能先删除文件在删除目录   实现递归删除(慎用 后果自负)
        System.out.println("是否删除成功:"+f.delete());
        File f2=new File("java.txt");
        //添加完整文件路径   盘符:\\包\\....文件
        System.out.println("绝对路径:"+f2.getAbsolutePath());
        //相对自己目录的地址进行定位
        System.out.println("相对路径:"+f2.getPath());
        //创建文件
        System.out.println("是否创建文件成功:"+f2.createNewFile());

    }
    @Test
    public void test(){
        File f=new File("d:\\a\\b\\c");
        //取出目录下文件对象
        File[] files=f.listFiles(); //返回多个file对象
        for(File file:files){
            System.out.println(file);
        }
        System.out.println("*********************");
        //取出目下所有文件名
        String[] names=f.list();//返回多个文件名
        for(String s:names){
            System.out.println(s);
        }
        System.out.println("**********************");
//        f.list(new FilenameFilter(){
//            @Override
//            public boolean accept(File dir, String name) {
//                return false;
//            }
//        });
        //list()  list(Filter参数)  都可以获取目录下所有文件名
        // 只不过 Filter 参数可以提供 类似于windows 下搜索功能
        String[] names2=f.list((dir,name)->{
            //dir   文件类型 表示  每一个文件对象
            //name  String  表示  每一个文件名称
           return  name.endsWith(".txt");
        });
        for(String str:names2){
            System.out.println(str);
        }
        System.out.println("**********************");
        f=new File("d:\\a\\b\\c\\a.txt");
        long len=f.length();// 文件对象所占的字节
        System.out.println("字节数:"+len);
    }
}
