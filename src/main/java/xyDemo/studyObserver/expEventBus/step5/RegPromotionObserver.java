package xyDemo.studyObserver.expEventBus.step5;

import xyDemo.studyObserver.expEventBus.PromotionService;
import xyDemo.studyObserver.expEventBus.step5.myEventBus.Subscribe;

import java.util.List;

public class RegPromotionObserver {
    private PromotionService promotionService; // 依赖注入

    public RegPromotionObserver() {
        promotionService = new PromotionService();
    }

    @Subscribe
    public void handleRegSuccess(Long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }

    @Subscribe
    public void testListSubscribe(List<Integer> list) {
        System.out.println("list 类型对象观察者。");
    }
}
