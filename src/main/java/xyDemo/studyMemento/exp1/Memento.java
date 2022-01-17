package xyDemo.studyMemento.exp1;

/**
 * 备忘录
 * 负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人。
 */
class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
