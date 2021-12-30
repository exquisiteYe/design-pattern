package xyDemo.studyObserver.exp1;

import sun.plugin2.message.BestJREAvailableMessage;
import sun.plugin2.message.Conversation;

public class Demo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObservers(new BestJREAvailableMessage(new Conversation()));
    }
}
