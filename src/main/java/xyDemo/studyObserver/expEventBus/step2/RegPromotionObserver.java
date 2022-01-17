package xyDemo.studyObserver.expEventBus.step2;

import xyDemo.studyObserver.expEventBus.PromotionService;
import xyDemo.studyObserver.expEventBus.RegObserver;

public class RegPromotionObserver implements RegObserver {
    private PromotionService promotionService; // 依赖注入
    public RegPromotionObserver() {
        promotionService = new PromotionService();
    }

    @Override
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
