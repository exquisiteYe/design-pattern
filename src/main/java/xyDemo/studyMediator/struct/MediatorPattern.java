package xyDemo.studyMediator.struct;

public class MediatorPattern {
    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2, c3;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();  // c1 和 c2 同一个中介
        c3 = new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        md.register(c3);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}

