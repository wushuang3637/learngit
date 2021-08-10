package day6;

/**
 * 1.定义一个类 Draw ， 在 类 中 提供 3 个 方法：输出直角三角形
 * （drawTrian()） 、 输出矩形（drawRec()） 及平行四边形（drawPra()）
 *  。通过方法可以输出由“*” 组成的一个图形。 同时在类中包含两个属
 *  性：星号的个数（count） 、行数（lines） 。最后在测试类中进行调用
 */
public class Draw {
    int count;
    int lines;
    // 直角三角形
    public void drawTrain(){
        for(int j=0;j<lines;j++) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
                count++;
            }
            System.out.println();
        }
    }
    //矩形
    public void drawRec(){
        for(int j=0;j<lines;j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("*");
                count++;
            }
            System.out.println();
        }
    }
    //平行四边形
    public void drawPra(){
        for(int j=0;j<lines;j++) {
            for(int i=0;i<5-j;i++){
                System.out.print(" ");
            }
            for (int i = 0; i < 5; i++) {
                System.out.print("*");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Draw d=new Draw();
        d.lines=5;
        d.drawPra();
        System.out.println();
        d.drawRec();
        d.drawTrain();
        System.out.println(d.count);
    }
}
