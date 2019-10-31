package ai.yunxi.builder;

// 有些情况下需要简化系统结构，可以把Director和抽象建造者进行结合
public abstract class NewBuilder {

    abstract void buildFrame();

    abstract void buildSeat();

    abstract void buildTire();

    abstract Bike createBike();

    /**
     * 把导演类中的construct()方法合并到抽象建造者类中
     */
    public Bike construct() {
        this.buildFrame();
        this.buildSeat();
        this.buildTire();
        return this.createBike();
    }
}
