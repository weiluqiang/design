package ai.yunxi.strategy;

/**
 * 策略模式(Strategy Pattern)
 * 策略模式也叫政策模式(Policy Pattern)。指的是对象具备某个行为，但是在不同的场景中，该行为有不同的实现算法。
 * 策略模式本质：分离算法，选择实现
 * <p>
 * 优点
 * 算法多样性，且具备自由切换功能；
 * 有效避免多重条件判断，增强了封装性，简化了操作，降低出错概率；
 * 扩展性良好，策略类遵顼 里氏替换原则，可以很方便地进行策略扩展；
 * <p>
 * 缺点
 * 策略类数量增多，且所有策略类都必须对外暴露，以便客户端能进行选择；
 * <p>
 * 使用场景
 * 针对同一类型问题，有多种处理方式，每一种都能独立解决问题；
 * 算法需要自由切换的场景；
 * 需要屏蔽算法规则的场景；
 * <p>
 * 策略模式主要包含三种角色：
 * 上下文角色(Context)：用来操作策略的上下文环境，屏蔽高层模块(客户端)对策略，算法的直接访问，封装可能存在的变化；
 * 抽象策略角色(Strategy)：规定策略或算法的行为；
 * 具体策略角色(ConcreteStrategy)：具体的策略或算法实现；
 */
public class StrategyPattern {

    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
