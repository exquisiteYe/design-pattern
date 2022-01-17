package xyDemo.studyObserver.expEventBus.step4;

import xyDemo.studyObserver.expEventBus.RegObserver;

import java.util.ArrayList;
import java.util.List;

public class UserClient {
    public static void main(String[] args) {
        UserController controller = new UserController();
        List<Object> observers = new ArrayList<>(); // 观察者

        observers.add(new RegNotificationObserver());
        observers.add(new RegPromotionObserver());
        observers.add(new RegPromotionObserver());
        observers.add(new RegPromotionObserver());
        observers.add(new RegPromotionObserver());
        observers.add(new RegPromotionObserver());

        controller.setRegObservers(observers);
        controller.register("132xxxx0022", "123");
        System.out.println("end");
    }
}
