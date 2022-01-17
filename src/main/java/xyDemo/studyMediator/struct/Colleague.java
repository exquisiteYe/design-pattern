package xyDemo.studyMediator.struct;

// 抽象同事类
public abstract class Colleague {
    protected Mediator mediator; // 中介，每个同事都有这个中介。

    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
