package ai.yunxi.factory.simple;

public class Divide implements Operation {

    @Override
    public double calculate(double num1, double num2) throws Exception {
        if (num2 == 0) {
            throw new Exception("除数不能为0");
        }
        return num1 / num2;
    }
}
