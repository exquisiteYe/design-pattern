package xyDemo.studyObserver.expEventBus.step3;

import xyDemo.studyObserver.expEventBus.UserService;
import xyDemo.studyObserver.expEventBus.RegObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

// 第二种实现方式，注册方法里面，调用观察者方法时，开始多线程。
// 缺点： 尽管利用了线程池解决了第一种实现方式的问题，但线程池、异步执行逻辑都耦合在了 register() 函数中，增加了这部分业务代码的维护成本。
public class UserController {
    private UserService userService; // 应该依赖注入实现
    private List<RegObserver> regObservers = new ArrayList<>();
    private Executor executor;

    public UserController(Executor executor) {
        userService = new UserService();
        this.executor = executor;
    }

    public void setRegObservers(List<RegObserver> observers) {
        regObservers.addAll(observers);
    }

    public Long register(String telephone, String password) {
        //省略输入参数的校验代码
        //省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);
        // 在 注册方法里面，调用观察者方法时，开始多线程。
        for (RegObserver observer : regObservers) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    observer.handleRegSuccess(userId);
                }
            });
        }

        return userId;
    }
}
