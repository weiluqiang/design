package ai.yunxi.factory.farm;

//具体工厂：养牛场
public class CattleFarm implements AnimalFarm {

    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }
}
