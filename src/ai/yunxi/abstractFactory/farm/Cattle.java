package ai.yunxi.abstractFactory.farm;

//具体产品：牛类
public class Cattle implements Animal {

    @Override
    public void feed() {
        System.out.println("农场开始养牛..");
    }
}
