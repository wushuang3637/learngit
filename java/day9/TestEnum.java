package day9;
//定义个枚举
public enum TestEnum {
    //只有调用三次无参构造
    //APPLE,ORANGE,BANANA;
    //只会调用二次有参构造
    APPLE("张三"),ORANGE("李四");
    //构造必须私有
    private TestEnum(){}
    //私有有参构造
    private TestEnum(String name){
        this.name=name;
    }
    String name;  //成员变量
    public void test(){ //普通方法
        System.out.println("我的姓名是:"+name);
    }
    public static void testStatic(){ } //静态方法

    public static void main(String[] args) {
        TestEnum enumObject1=TestEnum.APPLE;
        TestEnum enumObject2=TestEnum.APPLE;
        TestEnum enumObject3=TestEnum.ORANGE;
        TestEnum enumObject4=TestEnum.ORANGE;
        enumObject1.test();

        System.out.println(enumObject1);
        System.out.println(enumObject2);
        System.out.println(enumObject3);
        System.out.println(enumObject4);
    }
}
