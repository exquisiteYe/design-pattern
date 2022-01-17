package xyDemo.studyObserver.expEventBus.step4;


import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import xyDemo.studyObserver.expEventBus.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

// 利用 EventBus 框架实现的观察者模式，跟从零开始编写的观察者模式相比，从大的流程上来说，实现思路大致一样.
//  都需要定义 Observer，并且通过 register() 函数注册 Observer，
//  也都需要通过调用某个函数（比如，EventBus 中的 post() 函数）来给 Observer 发送消息（在 EventBus 中消息被称作事件 event）。
// 但在实现细节方面，它们又有些区别。
//  基于 EventBus，我们不需要定义 Observer 接口，任意类型的对象都可以注册到 EventBus 中，
//  通过 @Subscribe 注解来标明类中哪个函数可以接收被观察者发送的消息。
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

