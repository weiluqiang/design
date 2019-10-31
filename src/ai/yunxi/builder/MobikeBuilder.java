package ai.yunxi.builder;

import ai.yunxi.builder.entity.AlloyFrame;
import ai.yunxi.builder.entity.DermisSeat;
import ai.yunxi.builder.entity.SolidTire;

// 具体 builder 类
public class MobikeBuilder extends Builder {

    private Bike mBike = new Bike();

    @Override
    void buildFrame() {
        mBike.setFrame(new AlloyFrame());
    }

    @Override
    void buildSeat() {
        mBike.setSeat(new DermisSeat());
    }

    @Override
    void buildTire() {
        mBike.setTire(new SolidTire());
    }

    @Override
    Bike createBike() {
        return mBike;
    }
}
