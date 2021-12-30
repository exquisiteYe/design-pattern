package xyDemo.studyChainOfResponsibility.exp1;

import xyDemo.studyChainOfResponsibility.exp1.step2.Handler;

/**
 * Handler责任链
 * addHandler(Handler handler) 每次添加新的handler进来，
 *  都会将尾部handler的successor指向新的handler，
 *  并将该handler置为尾部。
 *  相当于，用successor进行了链接。
 */
public class HandlerChain {
    private Handler head = null;
    private Handler tail = null;

    public void addHandler(Handler handler) {
        handler.setSuccessor(null);

        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }

        tail.setSuccessor(handler);
        tail = handler;
    }

    public void handle() {
        if (head != null) {
            head.handle();
        }
    }
}
