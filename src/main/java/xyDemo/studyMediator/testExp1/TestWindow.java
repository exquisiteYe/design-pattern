package xyDemo.studyMediator.testExp1;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("我的第一个Frame");
        frame.setSize(500 , 600);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setVisible(true);
        Container container = frame.getContentPane();//获取窗体容器

        JTextField SentText;
        JTextArea ReceiveArea;

        Container cp;
        JScrollPane sp;
        JPanel p1, p2;
        cp = frame.getContentPane();
        SentText = new JTextField(18);
        ReceiveArea = new JTextArea(10, 18);
        ReceiveArea.setEditable(false);
        p1 = new JPanel();
        p1.setBorder(BorderFactory.createTitledBorder("接收内容："));
        p1.add(ReceiveArea);
        sp = new JScrollPane(p1);
        cp.add(sp, BorderLayout.NORTH);
//        p2 = new JPanel();
//        p2.setBorder(BorderFactory.createTitledBorder("发送内容："));
//        p2.add(SentText);
//        cp.add(p2, BorderLayout.SOUTH);

        frame.setLocation(100, 100);
        frame.setResizable(false); //窗口大小不可调整
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        BufferedReader intemp = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Press return key to exit.");
        while (true) {
            try{
                String s = intemp.readLine();
                if (s.equals("0")) {
                    break;
                }
                ReceiveArea.append(s+"\n");
                //使滚动条滚动到最底端
                ReceiveArea.setCaretPosition(ReceiveArea.getText().length());
//                Component component = new Component() {
//                }
//                container.add();

            } catch(IOException e){
                System.out.println("IOException");
            }
        }
        System.exit(0);
    }
}
