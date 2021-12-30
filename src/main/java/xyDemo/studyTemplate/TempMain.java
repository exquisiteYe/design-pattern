package xyDemo.studyTemplate;


public class TempMain {
    public static void main(String[] args) {
        AbstractClass demo = new ConcreteClass1();
        demo.templateMethod();
        demo.method1();
    }
}
