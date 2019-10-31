package ai.yunxi.builder;

import ai.yunxi.builder.entity.IFrame;
import ai.yunxi.builder.entity.ISeat;
import ai.yunxi.builder.entity.ITire;

public class Bike {

    private IFrame frame;
    private ISeat seat;
    private ITire tire;

    public IFrame getFrame() {
        return frame;
    }

    public void setFrame(IFrame frame) {
        this.frame = frame;
    }

    public ISeat getSeat() {
        return seat;
    }

    public void setSeat(ISeat seat) {
        this.seat = seat;
    }

    public ITire getTire() {
        return tire;
    }

    public void setTire(ITire tire) {
        this.tire = tire;
    }
}
