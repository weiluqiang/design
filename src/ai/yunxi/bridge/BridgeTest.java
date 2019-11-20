package ai.yunxi.bridge;

//桥接模式
public class BridgeTest {

    public static void main(String[] args) {
        Implementor impl = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(impl);
        abs.operation();
    }
}
