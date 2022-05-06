package xyDemo.studyObserver.expEventBus.step4;

import com.google.common.eventbus.Subscribe;
import xyDemo.studyObserver.expEventBus.NotificationService;

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
