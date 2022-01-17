package xyDemo.studyObserver.expEventBus;

public class NotificationService {
    public void sendInboxMessage(long userId, String message) {
        System.out.println("用户（id=" + userId + ")， 注册成功~" + message);
    }
}
