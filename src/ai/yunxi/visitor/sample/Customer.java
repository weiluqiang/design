package ai.yunxi.visitor.sample;

public class Customer implements Visitor {

    @Override
    public void choose(Dish dish) {
        System.out.println("选择了：" + dish.getName() + " " + dish.getWeight() + "份");
    }
}
