package xyDemo.studyChainOfResponsibility.exp1;

import xyDemo.studyChainOfResponsibility.exp1.step2.HandlerA;
import xyDemo.studyChainOfResponsibility.exp1.step2.HandlerB;

// 使用举例
public class Application {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
