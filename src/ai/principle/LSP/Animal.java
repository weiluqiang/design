package ai.principle.LSP;

//动物类
public class Animal {

    double runSpeed;

    public void setRunSpeed(double speed) {
        runSpeed = speed;
    }

    public double getRunTime(double distance) {
        return (distance / runSpeed);
    }
}
