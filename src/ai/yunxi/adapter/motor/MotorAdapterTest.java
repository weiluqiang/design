package ai.yunxi.adapter.motor;

public class MotorAdapterTest {

    public static void main(String[] args) {
        System.out.println("适配器模式测试：");
        Motor motor = new ElectricAdapter();
        motor.drive();
        motor = new OpticalAdapter();
        motor.drive();
    }
}
