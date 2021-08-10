package QuickHit;

import java.util.Random;

//游戏类
public class Game {
    private  Player play;// 玩家对象
    //机器随机生成字符串
    public String printStr(){
        StringBuffer buffer = new StringBuffer();
        Random random = new Random();
        //长度是根据玩家当前级别 对应的长度
        //类名.静态属性(数组)
        //数组[下标]==>级别对象
        //级别对象.属性
        int strLength=LevelParam.levels[play.getLevelNo()-1].getStrLength();
        // 通过循环生成要输出的字符串
        for (int i = 0; i < strLength; i++) {
            int rand = random.nextInt(strLength); // 产生随机数
            // 根据随机数拼接字符串
            switch (rand) {
                case 0: buffer.append(">");break;
                case 1: buffer.append(">");break;
                case 2: buffer.append("?");break;
                case 3: buffer.append("*");break;
                case 4: buffer.append("&");break;
                case 5: buffer.append("#");break;
                case 6: buffer.append("@");break;
            }
        }
        //随机的内容
        System.out.println(buffer);
        return buffer.toString();
    }
    //通过玩家输入的和随机生成的 匹配结果
    public void printResult(String out,String in){
        long end=System.currentTimeMillis();
        int times =(int)(  (end-play.getStartTime())/1000  );
        //判断  正确  1.超时  结束了    2.不超时  算分数
        //      错误  结束了
        //先获取用于目前对于的级别对象
        Level l=LevelParam.levels[play.getLevelNo()-1];
        //也可以使用用户没级别 总共的已用时间去比较
        if(times>l.getTimeLimit()){ //判断超时
            System.out.println(" -_- 游戏超时,游戏结束");
            System.exit(1);  //退出程序  1正常退出  0异常退出
        }else if(out.equals(in)){//判断输入正确
            //+ 积分   +已用时间  展示得分情况
            play.setCurrScore(play.getCurrScore()+l.getPerScore());
            play.setElapsedTime(play.getElapsedTime()+times);
            System.out.println(" ^_^ 输入正确，积分是:"+play.getCurrScore()+"级别是:"+play.getLevelNo()+"已用时间:"+play.getElapsedTime());
        }else{ //判断错误的
            System.out.println(" -_- 输入有误，游戏结束");
            System.exit(1);
        }
    }

    public Player getPlay() {
        return play;
    }

    public void setPlay(Player play) {
        this.play = play;
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            new Game().printStr();
        }
//        Random r=new Random();
//        for(int i=0;i<10;i++) {
//            int n=r.nextInt(11)+10;// 0-9 随机整数
//            System.out.println(n);
//        }
        // (int)(Math.random()*10);// 0-1随机数

    }
}
