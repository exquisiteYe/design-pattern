package xyDemo.studyObserver.expEventBus;


import java.util.Random;

public class UserService {
    public int register(String telephone, String password){
        System.out.println("用户注册");
        return new Random().nextInt();
    }
}
