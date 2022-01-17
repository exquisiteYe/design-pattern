package xyDemo.studyDecorator.ioDemo;

import java.io.*;

public class TestJavaIO {
    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("/user/wangzheng/test.txt");
        InputStream bin = new BufferedInputStream(in);

        in.read();
        bin.read();
        byte[] data = new byte[128];
        while (bin.read(data) != -1) {
            //...
        }
    }
}
