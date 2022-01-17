package xyDemo.studyObserver.expEventBus.step5.myEventBus;


import com.google.common.annotations.Beta;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Beta
public @interface Subscribe {}  // 定义一个Subscribe注解，用于标明观察者中的哪个函数可以接收消息
