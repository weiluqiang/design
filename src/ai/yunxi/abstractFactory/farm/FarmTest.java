package ai.yunxi.abstractFactory.farm;

public class FarmTest {

    public static void main(String[] args) {
        Farm happy = new HappyFarm();
        happy.newAnimal().feed();
        happy.newPlant().plant();
        System.out.println("--------------");
        Farm healthy = new HealthyFarm();
        healthy.newAnimal().feed();
        healthy.newPlant().plant();
    }
}
