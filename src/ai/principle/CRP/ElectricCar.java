package ai.principle.CRP;

//电动汽车
public class ElectricCar extends Car {

    public ElectricCar(Color color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println(color.getColor() + "电动汽车发动了");
    }
}
