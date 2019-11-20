package ai.yunxi.visitor.sample;

public class Egg extends Dish {

    public Egg() {
        this.name = "蛋";
        this.price = 1.0f;
        this.weight = 1;
    }

    public Egg(int weight) {
        this();
        this.price = this.price * weight;
        this.weight = weight;
    }

    @Override
    public void supplyTo(Visitor visitor) {
        visitor.choose(this);
    }
}
