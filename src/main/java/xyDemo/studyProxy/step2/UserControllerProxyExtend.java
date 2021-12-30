package xyDemo.studyProxy.step2;


import xyDemo.studyProxy.MetricsCollector;
import xyDemo.studyProxy.RequestInfo;
import xyDemo.studyProxy.UserVo;

/**
 * 用户代理类第二种。
 * 用于代理的类没有实现接口的情况，该代理类通过继承用户控制类来实现代理。
 */
public class UserControllerProxyExtend extends UserController {
    private MetricsCollector metricsCollector;

    public UserControllerProxyExtend() {
        this.metricsCollector = new MetricsCollector();
    }

    public UserVo login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        UserVo userVo = super.login(telephone, password);

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }

    public UserVo register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        UserVo userVo = super.register(telephone, password);

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }
}
