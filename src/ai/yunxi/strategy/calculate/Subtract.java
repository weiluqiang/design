package ai.yunxi.strategy.calculate;

public class Subtract implements Calculator {

    @Override
    public int compute(int a, int b) {
        return a - b;
    }
}
