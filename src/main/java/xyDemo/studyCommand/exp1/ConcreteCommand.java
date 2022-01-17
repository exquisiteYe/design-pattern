package xyDemo.studyCommand.exp1;

/**
 * 具体命令类
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    ConcreteCommand() {
        receiver = new Receiver();
    }

    public void execute() {
        receiver.action();
    }
}
