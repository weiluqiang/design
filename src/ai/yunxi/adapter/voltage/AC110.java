package ai.yunxi.adapter.voltage;

public class AC110 implements AC {
    public final int output = 110;

    @Override
    public int outputAC() {
        return output;
    }
}

