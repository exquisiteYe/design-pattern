package xyDemo.studyObserver.expEventBus.step5.myEventBus;


import com.google.common.base.Preconditions;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * ObserverRegistry 类就是前面讲到的 Observer 注册表，是最复杂的一个类，框架中几乎所有的核心逻辑都在这个类中。
 * 这个类大量使用了 Java 的反射语法，不过代码整体来说都不难理解，其中，一个比较有技巧的地方是 CopyOnWriteArraySet 的使用。
 *
 * CopyOnWriteArraySet，在写入数据的时候，会创建一个新的 set，并且将原始数据 clone 到新的 set 中，
 * 在新的 set 中写入数据完成之后，再用新的 set 替换老的 set。
 * 这样就能保证在写入数据的时候，不影响数据的读取操作，以此来解决读写并发问题。
 * 除此之外，CopyOnWriteSet 还通过加锁的方式，避免了并发写冲突。
 */
public class ObserverRegistry {
    private ConcurrentMap<Class<?>, CopyOnWriteArraySet<ObserverAction>> registry = new ConcurrentHashMap<>(); // 可以看做注册表

    public void register(Object observer) {
        Map<Class<?>, Collection<ObserverAction>> observerActions = findAllObserverActions(observer); // 得到了这个观察者所有的方法，与入参类型之间的map
        for (Map.Entry<Class<?>, Collection<ObserverAction>> entry : observerActions.entrySet()) {  // 遍历这个map的所有实例
            Class<?> eventType = entry.getKey();  // 参数类型
            Collection<ObserverAction> eventActions = entry.getValue();
            CopyOnWriteArraySet<ObserverAction> registeredEventActions = registry.get(eventType);
            if (registeredEventActions == null) {
                registry.putIfAbsent(eventType, new CopyOnWriteArraySet<>());
                registeredEventActions = registry.get(eventType);
            }
            registeredEventActions.addAll(eventActions);  // registry存map（key=入参类型，value=set（所有符合的ObserverAction，即观察者））），
        }
    }

    public List<ObserverAction> getMatchedObserverActions(Object event) {
        List<ObserverAction> matchedObservers = new ArrayList<>();
        Class<?> postedEventType = event.getClass();  // 获取事件类型
        for (Map.Entry<Class<?>, CopyOnWriteArraySet<ObserverAction>> entry : registry.entrySet()) {
            Class<?> eventType = entry.getKey();
            Collection<ObserverAction> eventActions = entry.getValue();
            if (postedEventType.isAssignableFrom(eventType)) {
                matchedObservers.addAll(eventActions);
            }
        }
        return matchedObservers;
    }

    private Map<Class<?>, Collection<ObserverAction>> findAllObserverActions(Object observer) {
        Map<Class<?>, Collection<ObserverAction>> observerActions = new HashMap<>();
        Class<?> clazz = observer.getClass();
        for (Method method : getAnnotatedMethods(clazz)) {  // 获取该对象的所有方法
            Class<?>[] parameterTypes = method.getParameterTypes();  // 获取方法的传入参数类型
            Class<?> eventType = parameterTypes[0];  // eventType 取该方法的第一个入参类型
            if (!observerActions.containsKey(eventType)) {  // 如果observerActions 这个map 不包含这个类型，则添加到map
                observerActions.put(eventType, new ArrayList<>());
            }
            observerActions.get(eventType).add(new ObserverAction(observer, method));  // map（key=入参参数类型，List[value=ObserverAction（观察者，方法）]）
        }
        return observerActions;
    }

    private List<Method> getAnnotatedMethods(Class<?> clazz) {
        List<Method> annotatedMethods = new ArrayList<>();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Subscribe.class)) { // 如果加了Subscribe注解，则进行处理
                Class<?>[] parameterTypes = method.getParameterTypes();
                Preconditions.checkArgument(parameterTypes.length == 1,
                        "Method %s has @Subscribe annotation but has %s parameters."
                                + "Subscriber methods must have exactly 1 parameter.",
                        method, parameterTypes.length);
                annotatedMethods.add(method);
            }
        }
        return annotatedMethods;
    }
}
