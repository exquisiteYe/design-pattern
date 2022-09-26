package xyDemo.studyTemplate;


public class TempMain {
    public static void main(String[] args) {
        AbstractClass demo = new ConcreteClass1();
        demo.templateMethod();

        // Java AbstractList 类中，addAll() 函数可以看作模板方法，调用了add()方法
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        HashSet<Integer> hs = new HashSet<>();
    }
}
