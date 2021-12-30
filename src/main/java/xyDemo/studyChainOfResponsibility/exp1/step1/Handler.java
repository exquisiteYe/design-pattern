package xyDemo.studyChainOfResponsibility.exp1.step1;


/**
 * Handler父类
 * 由子类实现抽象方法handle()，子类需要在handle()方法中，对链接的下一个Handler对象进行调用。
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle();
}

