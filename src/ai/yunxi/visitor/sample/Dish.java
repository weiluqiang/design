package ai.yunxi.visitor.sample;

/**
 * 菜品类
 */
public abstract class Dish {

    protected String name;
    protected float price;
    protected int weight;

    public abstract void supplyTo(Visitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
