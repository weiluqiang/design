package ai.yunxi.visitor.sample;

public class Meat extends Dish {

    public Meat() {
        this.name = "肉";
        this.price = 10.0f;
        this.weight = 1;
    }

    public Meat(int weight) {
        this();
        this.price = this.price * weight;
        this.weight = weight;
    }

    @Override
    public void supplyTo(Visitor visitor) {
        visitor.choose(this);
    }
}
