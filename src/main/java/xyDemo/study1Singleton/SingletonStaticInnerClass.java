package xyDemo.study1Singleton;


// 静态内部类：
// InstanceHolder 是一个静态内部类，当外部类 SingletonStaticInnerClass 被加载的时候，并不会创建 instance 实例对象。
// 只有当调用 getInstance() 方法时，SingletonHolder 才会被加载，这个时候才会创建 instance。
// 做到了懒加载，也做到了线程安全
public class SingletonStaticInnerClass {
    // 私有化构造方法
    private SingletonStaticInnerClass(){}

    private static class InstanceHolder {
        private static SingletonStaticInnerClass instance = new SingletonStaticInnerClass();
    }

    public SingletonStaticInnerClass getInstance() {
        return InstanceHolder.instance;
    }
}
