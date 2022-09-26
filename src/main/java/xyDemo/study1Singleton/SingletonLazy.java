package xyDemo.study1Singleton;

// 懒汉式，当获取的时候才创建
public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        // 会发生并发问题。
        if (instance == null) {   // 当多个线程都进入到这，会创建多个对象
            instance = new SingletonLazy();
        }
        return instance;
    }
}
