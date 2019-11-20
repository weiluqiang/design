package ai.yunxi.abstractFactory.farm;

//具体产品：马类
public class Horse implements Animal {

    @Override
    public void feed() {
        System.out.println("农场开始养马..");
    }
}
