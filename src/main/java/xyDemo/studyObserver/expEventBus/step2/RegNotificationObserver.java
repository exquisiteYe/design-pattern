package xyDemo.studyObserver.expEventBus.step2;

import xyDemo.studyObserver.expEventBus.NotificationService;
import xyDemo.studyObserver.expEventBus.RegObserver;

public class RegNotificationObserver implements RegObserver {
    private NotificationService notificationService;

    public RegNotificationObserver(){
        this.notificationService = new NotificationService();
    }

    @Override
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId, "Welcome...");
    }
}
