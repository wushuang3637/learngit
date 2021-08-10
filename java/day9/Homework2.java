package day9;

/**
 * 分析以下需求，并用代码实现：
 * (1)统计每个单词出现的次数
 * (2)有如下字符串"If you want to change your fate I
 * think you must come to the ujiuye to learn java"
 * (用空格间隔)
 * (3)打印格式：
 * to=3
 * think=1
 * you=2
 */
public class Homework2 {
    public static void main(String[] args) {
        String str="If you want to change your fate I"+
                "think you must come to " +
                "the ujiuye to learn java";
        String[] strs=str.split(" ");
        Word[]  words=new Word[20]; //长度无法定义
        boolean b=false;
        for(int i=0;i<strs.length;i++){
            for(int j=0;j<words.length;j++){
                if(words[j]==null) words[j]=new Word();
                if(strs[i].equals(words[j].word)){
                    //进入了if  说明找到了  所以次数加1
                    words[j].count++;
                    b=true;
                    break;
                }
            }
            if(!b){   //没有找到单词   记录第一次 次数记录1
                int m=0;
                for(int j=0;j<words.length;j++){
                    if(words[j].word==null){
                        m=j; //求出第一个出现null 的属性
                        break;
                    }
                }
                words[m].word=strs[i];
                words[m].count=1;
            }
        }


        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
    }
}
class Word{
    String word;
    int count;
    @Override
    public String toString() {
        return word+"="+count;
    }
}
