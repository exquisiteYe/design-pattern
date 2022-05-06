package xyDemo.studyBridge.struct;

public class BridgeTest {
    public static void main(String[] args) throws Exception{
        Implementor imple = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(imple);
        abs.Operation();
    }
}

