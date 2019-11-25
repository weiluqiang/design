package ai.principle.LSP;

//鸟类
public class Bird1 {

    double flySpeed;

    public void setSpeed(double speed) {
        flySpeed = speed;
    }

    public double getFlyTime(double distance) {
        return (distance / flySpeed);
    }
}
