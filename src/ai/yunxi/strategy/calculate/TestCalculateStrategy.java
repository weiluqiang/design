package ai.yunxi.strategy.calculate;

public class TestCalculateStrategy {

    public static void main(String[] args) {
        Calculator add = new Add();
        CalculateContext context = new CalculateContext(add);
        System.out.println(context.compute(2, 3));

        Calculator sub = new Subtract();
        context = new CalculateContext(sub);
        System.out.println(context.compute(4, 4));
    }
}
