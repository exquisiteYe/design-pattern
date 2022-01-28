package xyDemo.studyBridge.exp1;

//扩展抽象化角色：挎包
public class HandBag extends Bag {
    public String getName() {
        return color.getColor() + " HandBag";
    }
}
