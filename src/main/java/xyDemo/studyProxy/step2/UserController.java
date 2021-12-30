package xyDemo.studyProxy.step2;

import xyDemo.studyProxy.UserVo;

/**
 * 用户控制类，用于用户的登录和注册功能。
 */
public class UserController implements IUserController {
    //...省略其他属性和方法...

    @Override
    public UserVo login(String telephone, String password) {
        //...省略login逻辑...
        //...返回UserVo数据...
        return new UserVo();
    }

    @Override
    public UserVo register(String telephone, String password) {
        //...省略register逻辑...
        //...返回UserVo数据...
        return new UserVo();
    }
}
