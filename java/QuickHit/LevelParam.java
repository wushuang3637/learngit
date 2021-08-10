package QuickHit;
//级别参数类
public class LevelParam {
    public final static Level levels[]=new Level[6];//对应六个级别
    static {
        levels[0]=new Level(1, 2, 2, 30,1);
        levels[1]=new Level(2, 3, 2, 26,2);
        levels[2]=new Level(3, 4, 2, 22,5);
        levels[3]=new Level(4, 5, 2, 18,8);
        levels[4]=new Level(5, 6, 2, 15,10);
        levels[5]=new Level(6, 7, 2, 12,15);
    }

}
