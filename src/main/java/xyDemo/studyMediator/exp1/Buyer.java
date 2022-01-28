package xyDemo.studyMediator.exp1;

// 具体同事类：买方
public class Buyer extends Customer {
    private static final long serialVersionUID = -474879276076308825L;

    public Buyer(String name) {
        super(name);
        ClientWindow(350, 100);
    }

    public void send(String ad) {
        ReceiveArea.append("我(买方)说: " + ad + "\n");
        //使滚动条滚动到最底端
        ReceiveArea.setCaretPosition(ReceiveArea.getText().length());
        medium.relay(name, ad);
    }

    public void receive(String from, String ad) {
        ReceiveArea.append(from + "说: " + ad + "\n");
        //使滚动条滚动到最底端
        ReceiveArea.setCaretPosition(ReceiveArea.getText().length());
    }
}
