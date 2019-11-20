package ai.yunxi.abstractFactory.farm;

//抽象工厂：农场类
public interface Farm {

    Animal newAnimal();

    Plant newPlant();
}
