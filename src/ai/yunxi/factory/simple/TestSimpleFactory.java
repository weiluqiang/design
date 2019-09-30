package ai.yunxi.factory.simple;

/**
 * 简单工厂模式
 * <p>
 * 简单工厂模式是由一个工厂对象根据收到的消息决定要创建哪一个类的对象实例。
 * <p>
 * 工厂类负责创建的对象比较少，客户只需要传入工厂类参数，对于如何创建对象（逻辑）不关心。
 * 简单工厂模式很容易违反高内聚低耦合的原则，因此一般只在很简单的情况下使用。
 * <p>
 * 最大的优点在于工厂类中包含了必要的逻辑，根据客户需要的逻辑动态实例化相关的类。
 */
public class TestSimpleFactory {

    public static void main(String[] args) throws Exception {
        Operation add = SimpleFactory.newOperation("+");
        Operation subtract = SimpleFactory.newOperation("-");
        Operation multiply = SimpleFactory.newOperation("*");
        Operation divide = SimpleFactory.newOperation("/");

        System.out.println(add.calculate(1, 2));
        System.out.println(subtract.calculate(1, 2));
        System.out.println(multiply.calculate(1, 2));
        System.out.println(divide.calculate(1, 2));
    }
}
