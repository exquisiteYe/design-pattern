package xyDemo.studyStrategy.exp3;

import xyDemo.studyStrategy.exp3.step2.Sorter;

public class SortingTool {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        sorter.sortFile(args[0]);


    }

}
