package ai.yunxi.prototype;

public interface Product extends Cloneable {

    //use方法是用于“使用”的方法，具体怎么“使用”，则被交给子类去实现。
    void use(String s);

    //creatClone方法是用于复制实例的方法
    Product creatClone();
}
