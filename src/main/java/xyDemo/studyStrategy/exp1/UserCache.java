package xyDemo.studyStrategy.exp1;


// 策略接口：Strategy
// 策略类：ConcreteStrategyA、ConcreteStrategyB...
// 策略工厂：StrategyFactory

import xyDemo.dto.User;

import java.util.HashMap;
import java.util.Map;

public class UserCache {
    private Map<String, User> cacheData = new HashMap<>();
    private Strategy eviction;

    public UserCache(Strategy eviction) {
        this.eviction = eviction;
    }

    //...
}

