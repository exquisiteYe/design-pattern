package xyDemo.studyMemento.exp2;

import java.util.Scanner;
import java.util.Stack;

public class ApplicationMain {
    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder snapshotsHolder = new SnapshotHolder();

//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String input = scanner.next();
//            System.out.println(input);
//            if (input.equals(":list")) {
//                System.out.println(inputText.toString());
//            } else if (input.equals(":undo")) {
//                Snapshot snapshot = snapshotsHolder.popSnapshot();
//                inputText.restoreSnapshot(snapshot);
//            } else {
//                // 输入普通文本，添加备忘录。
//                snapshotsHolder.pushSnapshot(inputText.createSnapshot());
//                inputText.append(input);
//            }
//        }
        // 添加内容
        snapshotsHolder.pushSnapshot(inputText.createSnapshot());
        inputText.append("xiao");
        snapshotsHolder.pushSnapshot(inputText.createSnapshot());
        inputText.append("ding");
        snapshotsHolder.pushSnapshot(inputText.createSnapshot());  // 备忘录记录状态还是"","xiao","xiaoding"
        inputText.append("dang");  // 当前状态

        System.out.println(inputText.toString());  // 输出当前列表

        // 版本回退
        Snapshot cur = snapshotsHolder.popSnapshot();
        inputText.restoreSnapshot(cur);
        System.out.println(inputText.toString());  // 输出当前列表

        // 版本回退
        inputText.restoreSnapshot(snapshotsHolder.popSnapshot());
        System.out.println(inputText.toString());  // 输出当前列表

        snapshotsHolder.pushSnapshot(inputText.createSnapshot());
        inputText.append("wang");
        System.out.println(inputText.toString());  // 输出当前列表

        System.out.println("------------------");
        Stack<Integer> stack = new Stack<>();
        stack.push(123);
        stack.push(666);
        System.out.println(stack.pop());

        System.out.println("--------------");
        StringBuilder text = new StringBuilder("xiaodingdangzi");
        String text2 = "dangzi";

        text.replace(0, text.length(), text2);
        System.out.println(text.toString());
    }
}
