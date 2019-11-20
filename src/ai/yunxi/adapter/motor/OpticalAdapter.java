package ai.yunxi.adapter.motor;

//光能适配器
public class OpticalAdapter implements Motor {

    private OpticalMotor motor;

    public OpticalAdapter() {
        motor = new OpticalMotor();
    }

    public void drive() {
        motor.opticalDrive();
    }
}
