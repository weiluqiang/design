package ai.yunxi.factory.operation;

import ai.yunxi.factory.simple.Divide;
import ai.yunxi.factory.simple.Operation;

public class DivideFactory implements Factory {

    @Override
    public Operation newOperation() {
        System.out.println("除法运算");
        return new Divide();
    }
}
