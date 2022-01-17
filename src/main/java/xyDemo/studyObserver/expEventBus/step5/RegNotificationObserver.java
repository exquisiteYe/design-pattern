package xyDemo.studyObserver.expEventBus.step5;

import xyDemo.studyObserver.expEventBus.NotificationService;
import xyDemo.studyObserver.expEventBus.step5.myEventBus.Subscribe;

public class RegNotificationObserver {
    private NotificationService notificationService;

    public RegNotificationObserver() {
        notificationService = new NotificationService();
    }

    @Subscribe
    public void handleRegSuccess(Long userId) {
        notificationService.sendInboxMessage(userId, "...");
    }

}
