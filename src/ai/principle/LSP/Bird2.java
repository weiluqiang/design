package ai.principle.LSP;

//鸟类
public class Bird2 extends Animal {

    double flySpeed;

    public void setFlySpeed(double speed) {
        flySpeed = speed;
    }

    public double getFlyTime(double distance) {
        return (distance / flySpeed);
    }
}
