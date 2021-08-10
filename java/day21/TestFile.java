package day21;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        File f=new File("d://a//b//c//abc.txt");
        System.out.println(f.mkdirs());
    }
}
