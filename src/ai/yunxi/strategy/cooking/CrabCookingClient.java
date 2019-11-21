package ai.yunxi.strategy.cooking;

public class CrabCookingClient {

    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        CrabCooking cooking = new SteamedCrabs();
        kitchen.setStrategy(cooking);
        kitchen.cook();
        System.out.println("-----------------");
        cooking = new BraisedCrabs();
        kitchen.setStrategy(cooking);
        kitchen.cook();
    }
}
