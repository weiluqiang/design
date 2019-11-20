package ai.yunxi.factory.operation;

import ai.yunxi.factory.simple.Add;
import ai.yunxi.factory.simple.Operation;

public class AddFactory implements Factory {

    @Override
    public Operation newOperation() {
        System.out.println("加法运算");
        return new Add();
    }
}
