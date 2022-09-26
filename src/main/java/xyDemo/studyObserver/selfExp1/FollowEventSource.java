package xyDemo.studyObserver.selfExp1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FollowEventSource {
    public static Map<String, List<Follower>> followRelation = new HashMap<>();
    static {
        Blogger blogger1 = new Blogger("博主1");
        Blogger blogger2 = new Blogger("博主2");
        Blogger blogger3 = new Blogger("博主3");

        Follower follower1 = new Follower("A");
        Follower follower2 = new Follower("B");
        Follower follower3 = new Follower("C");
        Follower follower4 = new Follower("D");
        Follower follower5 = new Follower("E");

        followRelation.put(blogger1.getName(), Arrays.asList(follower1, follower2, follower3, follower4, follower5));
        followRelation.put(blogger2.getName(), Arrays.asList(follower2, follower4));
        followRelation.put(blogger3.getName(), Arrays.asList(follower1, follower2, follower5));
    }
    public void publishVideo(Blogger blogger) {
        // 1. 找到关注该博主的人，
        List<Follower> followerList = followRelation.get(blogger.getName());
        // 2. 推送消息
        for (Follower follower: followerList) {
            notify(blogger, follower);
        }
    }

    private void notify(Blogger blogger, Follower follower) {
        follower.follow(blogger, follower);
    }
}
