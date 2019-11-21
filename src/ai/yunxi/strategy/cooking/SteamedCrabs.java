package ai.yunxi.strategy.cooking;

//具体策略类：清蒸大闸蟹
public class SteamedCrabs implements CrabCooking {

    @Override
    public void cook() {
        System.out.println("清蒸大闸蟹...");
    }
}
