package ai.yunxi.abstractFactory.farm;

//具体产品：水果类
public class Fruit implements Plant {

    @Override
    public void plant() {
        System.out.println("农场开始种植水果..");
    }
}
