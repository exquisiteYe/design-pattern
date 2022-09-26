package xyDemo.studyObserver.selfExp1;

public class Follower implements FollowListener{
    private String name;

    public Follower(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void follow(Blogger blogger, Follower follower) {
        System.out.println(follower.getName() + ", 您关注的[" + blogger.getName() + "]更新视频啦！");
    }
}
