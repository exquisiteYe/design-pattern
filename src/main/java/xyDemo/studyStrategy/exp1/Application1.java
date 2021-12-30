package xyDemo.studyStrategy.exp1;

// 非运行时动态确定，在代码中指定使用哪种策略
public class Application1 {
    public static void main(String[] args) {
        //...
        Strategy evictionStrategy = new ConcreteStrategyA();
        UserCache userCache = new UserCache(evictionStrategy);
        //...
    }
}
