package xyDemo.studyStrategy.exp2;


import java.util.HashMap;
import java.util.Map;

// 策略的定义
public interface DiscountStrategy {
    double calDiscount(Order order);
}
// 省略NormalDiscountStrategy、GrouponDiscountStrategy、PromotionDiscountStrategy类代码...

