package xyDemo.studyObserver.expEventBus.step1;

public class UserClient {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.register("123", "as");
    }
}
