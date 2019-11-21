package ai.yunxi.strategy.calculate;

public class CalculateContext {

    Calculator calculator;

    public CalculateContext(Calculator calculator) {
        this.calculator = calculator;
    }

    public int compute(int a, int b) {
        return this.calculator.compute(a, b);
    }
}
