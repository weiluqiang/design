package ai.yunxi.abstractFactory.farm;

//具体产品：蔬菜类
public class Vegetable implements Plant {

    @Override
    public void plant() {
        System.out.println("农场开始种植蔬菜..");
    }
}
