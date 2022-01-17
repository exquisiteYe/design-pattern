package xyDemo.studyInterpreter;

import org.nfunk.jep.JEP;

public class JepDemo {
    public static void main(String[] args) {
        JEP jep = new JEP();
        //定义要计算的数据表达式
        String depositInterest = "本金*利率*时间";
        //给相关变量赋值
        jep.addVariable("本金", 10000);
        jep.addVariable("利率", 0.038);
        jep.addVariable("时间", 2);
        jep.parseExpression(depositInterest);    //解析表达式
        Object accrual = jep.getValue();    //计算
        System.out.println("存款利息：" + accrual);
    }
}
