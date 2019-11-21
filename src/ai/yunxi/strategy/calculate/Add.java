package ai.yunxi.strategy.calculate;

// 加法运算类
public class Add implements Calculator {

    @Override
    public int compute(int a, int b) {
        return a + b;
    }
}
