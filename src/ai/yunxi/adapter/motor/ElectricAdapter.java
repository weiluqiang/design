package ai.yunxi.adapter.motor;

//电能适配器
public class ElectricAdapter implements Motor {

    private ElectricMotor motor;

    public ElectricAdapter() {
        motor = new ElectricMotor();
    }

    public void drive() {
        motor.electricDrive();
    }
}
