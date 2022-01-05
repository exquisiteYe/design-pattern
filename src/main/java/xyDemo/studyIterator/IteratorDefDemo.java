package xyDemo.studyIterator;



/**
 * 接口定义方式一
 * next() 函数用来将游标后移一位元素，
 * currentItem() 函数用来返回当前游标指向的元素。
 */
public interface IteratorDefDemo<E> {
    boolean hasNext();
    void next();
    E currentItem();
}

///**
// * 接口定义方式二
// * 返回当前元素与后移一位这两个操作，要放到同一个函数 next() 中完成。
// */
//public interface Iterator<E> {
//    boolean hasNext();
//    E next();
//}
