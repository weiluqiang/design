package ai.principle.CRP;

//汽车类
public abstract class Car {

    protected Color color;

    public Car(Color color) {
        this.color = color;
    }

    public abstract void move();
}
