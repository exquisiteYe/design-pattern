package xyDemo.studyTemplate;


public abstract class AbstractClass {
    public final void templateMethod() {
        System.out.println("start - templateMethod");
        method1();
        //...
        method2();
        System.out.println("end - templateMethod");
    }

    protected abstract void method1();
    protected abstract void method2();
}
