package ai.yunxi.strategy.calculate;

public class CalculateContext {

    Calculator calculator;

    public CalculateContext(Calculator calculator) {
        this.calculator = calculator;
    }

    public int calculate(int a, int b) {
        return this.calculator.calculate(a, b);
    }
}
