package ai.yunxi.abstractFactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory ab = new ConcreteFactory1();
        Product1 product1 = ab.newProduct1();
        product1.show1();
        Product2 product2 = ab.newProduct2();
        product2.show2();
    }
}
