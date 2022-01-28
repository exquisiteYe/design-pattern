package xyDemo.studyBridge.exp1;

//扩展抽象化角色：钱包
public class Wallet extends Bag {
    public String getName() {
        return color.getColor() + " Wallet";
    }
}
