package ai.yunxi.abstractFactory.farm;

//具体工厂：健康农场类
public class HealthyFarm implements Farm {

    @Override
    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("水果播种！");
        return new Fruit();
    }
}
