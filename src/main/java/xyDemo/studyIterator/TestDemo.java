package xyDemo.studyIterator;


import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("xzg");
        names.add("wang");
        names.add("zheng");

        IteratorDefDemo<String> iterator = new ArrayIteratorDemo(names);
        while (iterator.hasNext()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
