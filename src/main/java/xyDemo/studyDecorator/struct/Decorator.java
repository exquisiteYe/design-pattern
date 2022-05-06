package xyDemo.studyDecorator.struct;

//抽象装饰角色
public class Decorator implements Component {
    // 引入具体的Component对象，对其方法进行装饰
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}
