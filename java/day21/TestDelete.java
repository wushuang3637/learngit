package day21;

import java.io.File;

//递归删除
//递归: 相当于自己本身 又调用自己本身
//5!=54321 ===5*4!
//4！=4321
//n!=n*n-1 ....*1  ===n*n-1！    n-1=n-1*n-2!
public class TestDelete {
    public static void main(String[] args) {
                        //注意  路径要写测试包  后果自负
        File f=new File("d://a");
        //deleteFile(f);
    }
    public static void deleteFile(File f){
        //每次删除之前要判断f 文件对象是否存在子目录
        File[] files=f.listFiles();
        if(files!=null&&files.length>0){//表示文件中存在子目录
            for(File file:files){
                //file 还是一个文件对象 还需要删除   自己调用自己实现递归
                deleteFile(file);
            }
        }else{ //当前file对象没有子目录
            boolean b=f.delete();
            if(b) System.out.println("删除成功:"+f.getAbsolutePath());
        }
        boolean b=f.delete();
        if(b) System.out.println("删除成功:"+f.getAbsolutePath());
    }
    public int math(int n){ //5
        int result=1;
        if(n==1) return 1;
        return n*math(n-1);
    }
}
