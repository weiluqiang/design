package ai.yunxi.adapter.voltage;

public interface DC5Adapter {

    boolean support(AC ac);

    int outputDC5V(AC ac);
}
