package ai.yunxi.factory;

//工场方法模式
public class FactoryTest {

    public static void main(String[] args) {
        Product a;
        AbstractFactory af = new ConcreteFactory1();
        a = af.newProduct();
        a.show();

        af = new ConcreteFactory2();
        a = af.newProduct();
        a.show();
    }
}
