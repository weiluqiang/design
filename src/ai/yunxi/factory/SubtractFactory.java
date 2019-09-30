package ai.yunxi.factory;

import ai.yunxi.factory.simple.Operation;
import ai.yunxi.factory.simple.Subtract;

public class SubtractFactory implements Factory {

    @Override
    public Operation newOperation() {
        System.out.println("减法运算");
        return new Subtract();
    }
}
