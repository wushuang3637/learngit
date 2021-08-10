package day8;

public abstract class Door {
    public  abstract  void open();//开门
    public  abstract  void close();//关门
}
interface Lock{
    public void openLock();//开锁
    public void closeLock();//关锁
}
interface  DoorBell{
    public void photo();//拍照
}
class BurglarproofDoor extends Door implements Lock,DoorBell{
    @Override
    public void open() {
        System.out.println("防盗门开门");
    }

    @Override
    public void close() {
        System.out.println("防盗门关门");
    }

    @Override
    public void openLock() {
        System.out.println("指纹识别 锁开了");
    }

    @Override
    public void closeLock() {
        System.out.println("指纹识别 门锁上了");
    }

    @Override
    public void photo() {
        System.out.println("开门之后  咔嚓 拍照");
    }

}
class WoodDoor extends Door{
    @Override
    public void open() {
        System.out.println("开门");
    }

    @Override
    public void close() {
        System.out.println("关门");
    }  //木门(开、关门)

}