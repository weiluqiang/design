package ai.yunxi.abstractFactory;

public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂 1 生成-->具体产品 1...");
        return new ConcreteProduct1();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂 1 生成-->具体产品 1...");
        return new ConcreteProduct2();
    }
}
