package xyDemo.studyProxy.step2;

import xyDemo.studyProxy.UserVo;

public interface IUserController {
    UserVo login(String telephone, String password);
    UserVo register(String telephone, String password);
}



