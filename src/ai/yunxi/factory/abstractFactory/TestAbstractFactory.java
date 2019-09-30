package ai.yunxi.factory.abstractFactory;

/**
 * 抽象工厂模式
 * <p>
 * 抽象工厂是围绕一个超级工厂创建其他工厂，该超级工厂又称为其他工厂的工厂。
 * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类。
 * <p>
 * 当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 */
public class TestAbstractFactory {

    public static void main(String[] args) {
        AbstractFactory linuxFactory = new LinuxFactory();
        linuxFactory.createButton().processEvent();
        linuxFactory.createText().getText();

        AbstractFactory windowsFactory = new WindowsFactory();
        windowsFactory.createButton().processEvent();
        windowsFactory.createText().getText();
    }
}
