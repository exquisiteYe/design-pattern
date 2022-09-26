package xyDemo.study1Singleton;

public class SingletonDoubleCheck {
    private SingletonDoubleCheck(){}

    // 3. volatile 的作用，禁止指令重排。
    //    instance = new SingletonDoubleCheck(); 在底层会发生，给对象分配空间，初始化对象，将指针指向对象。
    //    第一步是给 对象 分配内存空间；
    //    第二步开始调用 Singleton 的构造函数等，来初始化 singleton；
    //    第三步，将 singleton 对象指向分配的内存空间（执行完这步 singleton 就不是 null 了）
    //    分配空间肯定是第一步。但是第二步和第三步可能会重排。
    //      如果先第三步，先将引用引上，后初始化，当其他线程进来时，发现对象不为null，就返回了，这时候还未初始化，会引发问题。
    private static volatile SingletonDoubleCheck instance;

    public static SingletonDoubleCheck getInstance() {
        // 1、为什么不一进来就加锁，为了轻量。
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {  // 2. 加的是类锁
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
             }
        }
        return instance;
    }
}
