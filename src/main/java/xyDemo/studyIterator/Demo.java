package xyDemo.studyIterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        Iterator<String> iterator = names.iterator();
        iterator.next();
        names.remove("a");
        iterator.next();//抛出ConcurrentModificationException异常
    }
}
