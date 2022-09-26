package xyDemo.study1Singleton;

// 饿汉式，一开始就创建
public class SingletonHungary {

    // 设置为静态的，类初始化的时候，就存在了
    private static SingletonHungary instance = new SingletonHungary();

    // 构造方法私有化
    private SingletonHungary() {}

    // 开放一个接口，获取实例
    // 设置为static，不然获取不到！没法new 这个类
    public static SingletonHungary getInstance() {
        return instance;
    }
}
