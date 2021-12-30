package xyDemo.studyChainOfResponsibility.exp1.step1;

public class HandlerC extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        //...
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
