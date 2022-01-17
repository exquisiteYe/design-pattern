package xyDemo.studyObserver.expRing;

public class TeachEventListener implements BellEventListener{
    @Override
    public void heardBell(RingEvent e) {
        if (e.getSound()) {
            System.out.println("老师上课！");
        } else {
            System.out.println("老师下课啦~");
        }
    }
}
