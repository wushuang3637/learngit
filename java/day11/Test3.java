package day11;

public class Test3 {
    public static void main(String[] args) {
        String str="AklBeiCeiDl";
        StringBuilder sb=new StringBuilder(str);
        int count=sb.length();  //记录查找次数
        for(int i=0;i<count;i++){
            if(sb.charAt(i)>='A'&&sb.charAt(i)<='Z'){
                sb.append(sb.charAt(i));
                sb.deleteCharAt(i);
                i--; //必须-- 否则后一个字符 就等于之前删除的大写字符
                count--;  //查一次 少一次
            }
        }
        System.out.println(sb);
    }
}
