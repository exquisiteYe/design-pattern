package xyDemo.studyBridge.struct;

// 抽象化角色，定义抽象类，并包含一个对 实现化对象 的引用。
public abstract class Abstraction {
    protected Implementor imple;

    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }

    public abstract void Operation();
}
