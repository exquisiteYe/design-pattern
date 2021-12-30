package xyDemo.studyChainOfResponsibility.exp1.step2;


/**
 * 每个Handler类里面有一个 Handler对象 successor 。
 * successor 相当于当前Handler的下一次 Handler对象
 * step2的Handler父类，实现了handle()方法，完成了调用下一个successor。
 * step2的doHandle()，为各个子类实现的处理方法。
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 相当于模板方法，开放一个doHandle()供其子类实现
     */
    public final void handle() {
        boolean handled = doHandle();
        if (successor != null && !handled) {  // successor == curHandler.next;
            successor.handle();
        }
    }

    protected abstract boolean doHandle();
}

