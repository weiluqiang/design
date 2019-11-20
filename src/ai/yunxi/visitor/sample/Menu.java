package ai.yunxi.visitor.sample;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    List<Dish> dishes = new ArrayList<>();
    float total = 0f;

    public void add(Dish dish) {
        dishes.add(dish);
    }

    public void remove(Dish dish) {
        dishes.remove(dish);
    }

    public void orderTo(Visitor visitor) {
        dishes.forEach(dish -> {
            dish.supplyTo(visitor);
            total += dish.getPrice();
        });

        System.out.println("总价：" + total);
    }
}
