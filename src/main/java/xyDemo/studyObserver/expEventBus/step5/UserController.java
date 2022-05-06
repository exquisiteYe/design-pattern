package xyDemo.studyObserver.expEventBus.step5;

import xyDemo.studyObserver.expEventBus.UserService;
import xyDemo.studyObserver.expEventBus.step5.myEventBus.AsyncEventBus;
import xyDemo.studyObserver.expEventBus.step5.myEventBus.EventBus;

import java.util.List;
import java.util.concurrent.Executors;

public class UserController {
    private UserService userService; // 依赖注入,目前没有配置scanner扫描

    private EventBus eventBus;
    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    public UserController() {
        userService = new UserService();
        //eventBus = new EventBus(); // 同步阻塞模式
        eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE)); // 异步非阻塞模式
    }

    public void setRegObservers(List<Object> observers) {
        for (Object observer : observers) {
            eventBus.register(observer);
        }
    }

    public Long register(String telephone, String password) {
        //省略输入参数的校验代码
        //省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);
        // 类型为long的观察者，
        eventBus.post(userId);

        return userId;
    }
}
