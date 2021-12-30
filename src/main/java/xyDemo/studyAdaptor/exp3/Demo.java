package xyDemo.studyAdaptor.exp3;

// 在我们的项目中，外部系统A的使用示例
public class Demo {
    private IA a;

    public Demo(IA a) {
        this.a = a;
    }
    //...
    public static void main(String[] args) {
        Demo d = new Demo(new A());
    }
}


