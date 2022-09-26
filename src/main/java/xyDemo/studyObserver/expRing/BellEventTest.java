package xyDemo.studyObserver.expRing;

// 客户端
public class BellEventTest {
    public static void main(String[] args) {
        BellEventSource source = new BellEventSource(); // 铃（事件源）
        source.addPersonListener(new TeachEventListener());  // 添加监听器-老师
        source.addPersonListener(new StuEventListener());  // 添加监听器-学生

        source.ring(true);
        System.out.println("-----------------");
        source.ring(false);

    }
}
