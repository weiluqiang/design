package ai.yunxi.strategy.cooking;

//具体策略类：红烧大闸蟹
public class BraisedCrabs implements CrabCooking {

    @Override
    public void cook() {
        System.out.println("红烧大闸蟹...");
    }
}
