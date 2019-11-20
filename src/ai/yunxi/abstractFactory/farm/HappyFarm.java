package ai.yunxi.abstractFactory.farm;

//具体工厂：开心农场类
public class HappyFarm implements Farm {

    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("蔬菜播种！");
        return new Vegetable();
    }
}
