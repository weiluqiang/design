package ai.yunxi.visitor;

public class Vegetable extends Dish {

    public Vegetable() {
        this.name = "蔬菜";
        this.price = 5.0f;
        this.weight = 1;
    }

    public Vegetable(int weight) {
        this();
        this.price = this.price * weight;
        this.weight = weight;
    }

    @Override
    public void supplyTo(Visitor visitor) {
        visitor.choose(this);
    }
}
