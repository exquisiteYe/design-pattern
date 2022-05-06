package xyDemo.studyObserver.expEventBus;

import org.springframework.stereotype.Service;

@Service
public class PromotionService {
    public void issueNewUserExperienceCash(long id) {
        System.out.println("给用户(id=" + id + ") 发放投资体验金。");
    }
}
