package ai.yunxi.factory.farm;

public class AnimalFarmTest {

    public static void main(String[] args) {
        Animal a;
        AnimalFarm af;
        af = new HorseFarm();
        a = af.newAnimal();
        a.show();

        af = new CattleFarm();
        a = af.newAnimal();
        a.show();
    }
}
