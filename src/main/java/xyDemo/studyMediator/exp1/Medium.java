package xyDemo.studyMediator.exp1;

//抽象中介者：中介公司
public interface Medium {
    void register(Customer member); //客户注册

    void relay(String from, String ad); //转发
}

