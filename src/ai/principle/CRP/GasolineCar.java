package ai.principle.CRP;

//汽油汽车
public class GasolineCar extends Car {

    public GasolineCar(Color color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println(color.getColor() + "汽油汽车发动了");
    }
}
