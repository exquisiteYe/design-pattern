package xyDemo.studyObserver.expEventBus.step4;

import com.google.common.eventbus.Subscribe;
import xyDemo.studyObserver.expEventBus.PromotionService;

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
