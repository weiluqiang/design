package ai.yunxi.builder;

/**
 * 建造者模式
 */
public class TestBikeClient {

    public static void main(String[] args) {
        System.out.println("----new Mobike----");
        showBike(new MobikeBuilder());
        System.out.println("----new ofo----");
        showBike(new OfoBuilder());
    }

    private static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        bike.getFrame().frame();
        bike.getSeat().seat();
        bike.getTire().tire();
    }

    private static void showBike(NewBuilder builder) {
        Bike bike = builder.construct();
        bike.getFrame().frame();
        bike.getSeat().seat();
        bike.getTire().tire();
    }
}
