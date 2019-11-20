package ai.yunxi.factory.operation;

import ai.yunxi.factory.simple.Operation;

/**
 * 工厂方法模式
 * <p>
 * 定义一个创建对象的工厂接口，让子类决定实例化哪一个类，将实际创建工作推迟到子类当中。
 * <p>
 * 1、日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。
 * 2、数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。
 * 3、设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。
 * <p>
 * 创建对象的接口，让子类决定具体实例化的对象，把简单的内部逻辑判断移到了客户端。
 * 工厂方法模式克服了简单工厂所违背的开闭原则的缺点，又保持了封装对象创建过程的优点。
 * 扩展性高，想要增加一个产品，只要扩展一个工厂类就可以。
 */
public class TestFactory {

    public static void main(String[] args) throws Exception {
        // 使用反射实例化工厂对象，因为字符串是可以通过变量改变的
        Factory addFactory = new AddFactory();
        Factory subFactory = new SubtractFactory();
        Factory multiplyFactory = new MultiplyFactory();
        Factory divideFactory = new DivideFactory();

        // 通过工厂对象创建相应的实例对象
        Operation add = addFactory.newOperation();
        Operation sub = subFactory.newOperation();
        Operation multiply = multiplyFactory.newOperation();
        Operation divide = divideFactory.newOperation();

        System.out.println(add.compute(1, 2));
        System.out.println(sub.compute(1, 2));
        System.out.println(multiply.compute(1, 2));
        System.out.println(divide.compute(1, 2));
    }
}
