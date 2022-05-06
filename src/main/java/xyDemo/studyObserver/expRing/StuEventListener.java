package xyDemo.studyObserver.expRing;

public class StuEventListener implements BellEventListener{
    @Override
    public void heardBell(RingEvent e) {
        if (e.getSound()) { // 如果是上课
            System.out.println("同学上课！");
        } else {
            System.out.println("同学下课啦~");
        }
    }
}
