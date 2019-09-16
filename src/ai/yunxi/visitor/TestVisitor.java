package ai.yunxi.visitor;

/**
 * 来访者模式
 * <p>
 * 关键词：访问者， 被访问者（元素），元素群，双重注入，操作
 * <p>
 * 访问者模式的作用：
 * 对【元素】、【访问者】和【对元素的操作】进行单独抽象和封装。
 * 一旦这些【访问者】的增加或者是【对元素的操作】发生变化，不需要修改【元素】。
 */
public class TestVisitor {

    public static void main(String[] args) {
        // 来了一个顾客
        Visitor visitor = new Customer();
        // 点菜
        Menu menu = new Menu();
        menu.add(new Meat(1));
        Dish egg = new Egg(2);
        menu.add(egg);
        menu.add(new Vegetable(2));
        menu.remove(egg);
        menu.orderTo(visitor);
    }
}
