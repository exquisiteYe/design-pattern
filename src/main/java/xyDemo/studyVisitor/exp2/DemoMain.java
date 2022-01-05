package xyDemo.studyVisitor.exp2;

public class DemoMain {
    public static void main(String[] args) {
        SingleDispatchClass demo = new SingleDispatchClass();
        ParentClass p = new ChildClass();
        demo.polymorphismFunction(p); // 执行【哪个对象】的方法，由对象的实际类型决定
        demo.overloadFunction(p);     // 执行【对象的哪个方法】，由参数对象的声明类型决定

        demo.overloadFunction2(p);
    }
}


