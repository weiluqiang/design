package ai.yunxi.composite.sample;

//抽象根类：Component
public abstract class Directory {
    protected String name;

    public Directory(String name) {
        this.name = name;
    }

    public abstract void print();
}
