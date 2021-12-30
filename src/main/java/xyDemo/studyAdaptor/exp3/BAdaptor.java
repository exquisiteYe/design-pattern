package xyDemo.studyAdaptor.exp3;

import org.apache.ibatis.ognl.IteratorEnumeration;

import java.util.Enumeration;
import java.util.Iterator;

// 将外部系统A替换成外部系统B
public class BAdaptor implements IA {
    private B b;

    public BAdaptor(B b) {
        this.b = b;
    }

    public void fa() {
        //...
        b.fb();
    }

    public static void main(String[] args) {
        // 借助BAdaptor，Demo的代码中，调用IA接口的地方都无需改动，
        // 只需要将BAdaptor如下注入到Demo即可。
        Demo d = new Demo(new BAdaptor(new B()));

    }
}


