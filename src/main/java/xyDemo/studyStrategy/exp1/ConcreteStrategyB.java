package xyDemo.studyStrategy.exp1;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithmInterface() {
        //具体的算法...
    }

    public static void main(String[] args) {
        Strategy s = StrategyFactory.getStrategy("A") ;
    }
}
