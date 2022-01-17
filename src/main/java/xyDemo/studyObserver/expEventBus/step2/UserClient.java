package xyDemo.studyObserver.expEventBus.step2;


import xyDemo.studyObserver.expEventBus.RegObserver;

import java.util.ArrayList;
import java.util.List;

public class UserClient {
    public static void main(String[] args) {
        UserController controller = new UserController();
        List<RegObserver> observers = new ArrayList<>(); // 观察者

        observers.add(new RegNotificationObserver());
        observers.add(new RegPromotionObserver());

        controller.setRegObservers(observers);
        controller.register("132xxxx0022", "123");
    }
}
