package ai.yunxi.factory.simple;

public class Add implements Operation {

    @Override
    public double compute(double num1, double num2) {
        return num1 + num2;
    }
}
