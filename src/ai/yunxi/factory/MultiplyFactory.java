package ai.yunxi.factory;

import ai.yunxi.factory.simple.Multiply;
import ai.yunxi.factory.simple.Operation;

public class MultiplyFactory implements Factory {

    @Override
    public Operation newOperation() {
        System.out.println("乘法运算");
        return new Multiply();
    }
}
