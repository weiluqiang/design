package ai.principle.CRP;

public class CRPTest {

    public static void main(String[] args) {
        Car car1 = new GasolineCar(new White());
        car1.move();

        Car car2 = new ElectricCar(new Black());
        car2.move();
    }
}
