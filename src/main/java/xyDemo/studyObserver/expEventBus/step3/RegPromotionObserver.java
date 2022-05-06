package xyDemo.studyObserver.expEventBus.step3;

import xyDemo.studyObserver.expEventBus.PromotionService;
import xyDemo.studyObserver.expEventBus.RegObserver;

// 异步实现的第一种方式：
// 更改观察者里面的 handleRegSuccess 实现，新建一个线程来处理。
// 缺点：频繁地创建和销毁线程比较耗时，并且并发线程数无法控制，创建过多的线程会导致堆栈溢出
public class RegPromotionObserver implements RegObserver {
    private PromotionService promotionService;

    public RegPromotionObserver() {
        promotionService = new PromotionService();
    }

    @Override
    public void handleRegSuccess(long userId) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                promotionService.issueNewUserExperienceCash(userId);
            }
        });
        thread.start();
    }
}
