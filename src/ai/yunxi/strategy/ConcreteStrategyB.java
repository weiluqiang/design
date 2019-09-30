package ai.yunxi.strategy;

// 具体策略类
public class ConcreteStrategyB implements Strategy {

    @Override
    public void algorithm() {
        System.out.println("strategy B");
    }
}
