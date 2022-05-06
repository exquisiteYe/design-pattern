package xyDemo.studyObserver.expRing;

import java.util.EventObject;

// 铃声事件类：用于封装事件源 及 一些与事件相关的参数
public class RingEvent extends EventObject {
    private static final long serialVersionUID = 1L;
    private boolean sound;  // true-上课铃，false-下课铃

    public RingEvent(Object source, boolean sound) {
        super(source);
        this.sound = sound;
    }

    public boolean getSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }
}
