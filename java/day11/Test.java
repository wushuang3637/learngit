package day11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str="34 9 -1 78 3 22 za aa AB bz CC CA bb";
        String[] strs=str.split(" ");
        System.out.println(Arrays.toString(strs));
        for(int i=0;i<strs.length-1;i++){
            for(int j=i;j<strs.length;j++){
                if(strs[i].compareTo(strs[j])<0){
                    String temp=strs[i];
                    strs[i]=strs[j];
                    strs[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(strs));
    }
}
