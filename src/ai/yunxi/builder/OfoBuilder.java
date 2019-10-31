package ai.yunxi.builder;

import ai.yunxi.builder.entity.CarbonFrame;
import ai.yunxi.builder.entity.InflateTire;
import ai.yunxi.builder.entity.RubberSeat;

// 具体 builder 类
public class OfoBuilder extends NewBuilder {

    private Bike oBike = new Bike();

    @Override
    void buildFrame() {
        oBike.setFrame(new CarbonFrame());
    }

    @Override
    void buildSeat() {
        oBike.setSeat(new RubberSeat());
    }

    @Override
    void buildTire() {
        oBike.setTire(new InflateTire());
    }

    @Override
    Bike createBike() {
        return oBike;
    }
}
