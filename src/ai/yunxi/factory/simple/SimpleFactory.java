package ai.yunxi.factory.simple;

public class SimpleFactory {

    private static Operation newAdd() {
        log("加法运算");
        return new Add();
    }

    private static Operation newSubtract() {
        log("减法运算");
        return new Subtract();
    }

    private static Operation newMultiply() {
        log("乘法运算");
        return new Multiply();
    }

    private static Operation newDivide() {
        log("除法运算");
        return new Divide();
    }

    private static void log(String message) {
        System.out.println(message);
    }

    public static Operation getOperation(String operator) {
        switch (operator) {
            case "+":
                return newAdd();
            case "-":
                return newSubtract();
            case "*":
                return newMultiply();
            case "/":
                return newDivide();
            default:
                return null;
        }
    }
}
