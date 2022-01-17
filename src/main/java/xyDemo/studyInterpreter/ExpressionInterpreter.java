package xyDemo.studyInterpreter;


import java.util.Deque;
import java.util.LinkedList;

public class ExpressionInterpreter {
    private Deque<Long> numbers = new LinkedList<>();

    public long interpret(String expression) {
        String[] elements = expression.split(" ");
        int length = elements.length;
        for (int i = 0; i < (length+1)/2; ++i) { // 取前多一半为number
            numbers.addLast(Long.parseLong(elements[i]));
        }

        for (int i = (length+1)/2; i < length; ++i) {  // 取后少一半为运算符
            String operator = elements[i];
            boolean isValid = "+".equals(operator) || "-".equals(operator)
                    || "*".equals(operator) || "/".equals(operator);
            if (!isValid) {
                throw new RuntimeException("Expression is invalid: " + expression);
            }

            long number1 = numbers.pollFirst();
            long number2 = numbers.pollFirst();
            long result = 0;
            if (operator.equals("+")) {
                result = number1 + number2;
            } else if (operator.equals("-")) {
                result = number1 - number2;
            } else if (operator.equals("*")) {
                result = number1 * number2;
            } else if (operator.equals("/")) {
                result = number1 / number2;
            }
            numbers.addFirst(result);
        }

        if (numbers.size() != 1) {
            throw new RuntimeException("Expression is invalid: " + expression);
        }

        return numbers.pop();
    }

    public static void main(String[] args) {
        ExpressionInterpreter interpreter = new ExpressionInterpreter();
        String expression = "8 2 1 5 + - *";
        System.out.println(interpreter.interpret(expression) == 45);
    }
}
