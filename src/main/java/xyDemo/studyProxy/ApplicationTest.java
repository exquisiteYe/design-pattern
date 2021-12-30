package xyDemo.studyProxy;

import xyDemo.studyProxy.step2.IUserController;
import xyDemo.studyProxy.step2.UserController;
import xyDemo.studyProxy.step2.UserControllerProxy;
import xyDemo.studyProxy.step2.UserControllerProxyExtend;
import xyDemo.studyProxy.step3.MetricsCollectorProxy;

public class ApplicationTest {
    public static void main(String[] args) {
        //UserControllerProxy使用举例
//因为原始类和代理类实现相同的接口，是基于接口而非实现编程
//将UserController类对象替换为UserControllerProxy类对象，不需要改动太多代码
        IUserController userController = new UserControllerProxy(new UserController());
        userController.login("", "");

        //UserControllerProxyExtend使用举例
        UserController userControllerExtend = new UserControllerProxyExtend();

        //MetricsCollectorProxy使用举例
        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        IUserController userControllerDynamic = (IUserController) proxy.createProxy(new UserController());
    }
}
