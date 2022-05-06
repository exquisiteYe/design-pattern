package xyDemo.studyObserver.expEventBus.step2;

import xyDemo.studyObserver.expEventBus.RegObserver;
import xyDemo.studyObserver.expEventBus.UserService;

import java.util.ArrayList;
import java.util.List;

// 利用观察者模式，将 发放金 与 发信息 作为 用户注册 的两个观察者。
public class UserController {
    private UserService userService; // 依赖注入
    private List<RegObserver> regObservers = new ArrayList<>();

    public UserController() {
        this.userService = new UserService();
    }

    // 一次性设置好，之后也不可能动态的修改
    public void setRegObservers(List<RegObserver> observers) {
        regObservers.addAll(observers);
    }

    public Long register(String telephone, String password) {
        //省略输入参数的校验代码
        //省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);

        for (RegObserver observer : regObservers) {
            observer.handleRegSuccess(userId);
        }
        return userId;
    }
}
