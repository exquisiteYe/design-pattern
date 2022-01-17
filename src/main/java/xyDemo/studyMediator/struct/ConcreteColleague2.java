package xyDemo.studyMediator.struct;

// 具体同事类
public class ConcreteColleague2 extends Colleague {
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }

    public void send() {   // 具体同事类1和具体同事类2都有【请求中介者转发】的调用。
        System.out.println("具体同事类2发出请求。");
        mediator.relay(this); // 请中介者转发
    }
}
