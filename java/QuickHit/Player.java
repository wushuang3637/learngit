package QuickHit;

import java.util.Scanner;

//玩家类
public class Player {
    private int levelNo;//当前级别
    private int currScore;//当前级别积分
    private long startTime;//开始时间
    private int elapsedTime;//已用时间
    public static void main(String[] args) {
        new Player().play();
    }
    public void play(){ //玩游戏
        Scanner sc=new Scanner(System.in);
        //初始化  该new 对象 该赋初值 赋值
        Game  g=new Game();
        g.setPlay(new Player());
        //根据级别实现不同级别游戏过程
        for(int i=0;i<6;i++) {
            // (开始 积分清0  记录开始时间 --玩--结束 （printResult）)  循环6次
            Player play=g.getPlay();
            play.setLevelNo(play.getLevelNo()+1); //晋级
            play.setCurrScore(0); //积分清零
            play.setElapsedTime(0); //已用时间清零
            System.out.println("开始游戏，当前等级是:"+play.getLevelNo());
            long startTime=System.currentTimeMillis();//记录当前时间的毫秒数
            play.setStartTime(startTime);//开始的时间
            int strTimes=LevelParam.levels[play.getLevelNo()-1].getStrTimes();
            for(int j=0;j<strTimes;j++) {
                //随机生成一个字符串
                String out=g.printStr();
                //手动输入
                String in=sc.next();
                //比较结果
                g.printResult(out,in);
            }
        }
    }
    public int getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    public int getCurrScore() {
        return currScore;
    }

    public void setCurrScore(int currScore) {
        this.currScore = currScore;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public int getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(int elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
}
