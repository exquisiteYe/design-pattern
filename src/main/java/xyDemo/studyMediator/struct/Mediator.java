package xyDemo.studyMediator.struct;

// 抽象中介者，它是中介者的接口，提供了同事对象【注册】与【转发】同事对象信息的抽象方法。
public abstract class Mediator {
    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague cl); //转发
}
