package xyDemo.studyObserver.struct;

public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject(); // 被观察的对象
        Observer obs1 = new ConcreteObserver1();  // 观察者1
        Observer obs2 = new ConcreteObserver2();  // 观察者2
        subject.add(obs1);
        subject.add(obs2);  // 加入到被观察对象的 观察队列 里
        subject.notifyObserver();
    }
}

