package xyDemo.studyObserver.expRing;

import java.util.EventListener;

public interface BellEventListener extends EventListener {
    void heardBell(RingEvent e);
}
