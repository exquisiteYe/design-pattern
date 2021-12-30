package xyDemo.studyAdaptor.exp1;

/**
 * 场景1：封装有缺陷的接口设计
 */
public class CDAdaptor extends CD implements ITarget {
    //...
    public void function1() {
        super.staticFunction1();
    }

    public void function2() {
        super.uglyNamingFunction2();
    }

    public void function3(Object paramsWrapper) {
        // doSomething
        super.tooManyParamsFunction3(123, 456);
    }

    public void function4() {
        //...reimplement it...
    }
}
