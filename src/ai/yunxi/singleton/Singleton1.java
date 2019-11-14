package ai.yunxi.singleton;

//饿汉式，最简单的写法，缺点在于实例在类初始化的时候就创建了，如果在整个项目中都没有使用到该类，就会创建内存空间的浪费。
public class Singleton1 {

    private Singleton1() {
    }

    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }
}
