package xyDemo.studyAdaptor.ExtendBased;

import xyDemo.studyAdaptor.Adaptee;
import xyDemo.studyAdaptor.ITarget;

/**
 * 类适配器: 基于继承
 */
public class Adaptor extends Adaptee implements ITarget {
    public void f1() {
        super.fa();
    }

    public void f2() {
        //...重新实现f2()...
    }

    // 这里fc()不需要实现，直接继承自Adaptee，这是跟对象适配器最大的不同点
}
