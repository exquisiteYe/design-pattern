package xyDemo.studyObserver.expEventBus.step5.myEventBus;


import java.util.concurrent.Executor;

public class AsyncEventBus extends EventBus {
    public AsyncEventBus(Executor executor) {
        super(executor);
    }
}
