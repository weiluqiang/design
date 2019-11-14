package ai.yunxi.singleton;

//懒汉式，解决了写法一在类初始化的时候就创建实例的问题
//然而只能在单线程中使用，在多线程中使用如果多个线程同时进入if语句中，就可能出现创建多个实例的问题。
public class Singleton2 {

    private Singleton2() {
    }

    private static Singleton2 instance;

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
