package xyDemo.studyMemento.exp2;

/**
 * 相当于备忘录。提供存入内容和获取内容的功能
 */
public class Snapshot {
    private String text;

    public Snapshot(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
