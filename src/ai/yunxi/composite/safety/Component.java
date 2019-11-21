package ai.yunxi.composite.safety;

//抽象构件
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract String operation();
}
