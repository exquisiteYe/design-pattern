package xyDemo.studyObserver.expEventBus.step1;


import xyDemo.studyObserver.expEventBus.PromotionService;
import xyDemo.studyObserver.expEventBus.UserService;

// 虽然注册接口做了两件事情，注册和发放体验金，违反单一职责原则
// 但是，如果没有扩展和修改的需求，现在的代码实现是可以接受的。
public class UserController {
    private UserService userService; // 依赖注入
    private PromotionService promotionService; // 依赖注入
    public UserController() {
        promotionService = new PromotionService();
        userService = new UserService();
    }
    public Long register(String telephone, String password) {
        //省略输入参数的校验代码
        //省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);
        promotionService.issueNewUserExperienceCash(userId);
        return userId;
    }
}
