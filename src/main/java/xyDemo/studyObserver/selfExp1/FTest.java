package xyDemo.studyObserver.selfExp1;

public class FTest {
    public static void main(String[] args) {
        FollowEventSource source = new FollowEventSource();
        Blogger blogger = new Blogger("博主3");
        source.publishVideo(blogger);
    }
}
