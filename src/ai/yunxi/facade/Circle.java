package ai.yunxi.facade;

/**
 * 子系统(SubSystem)角色
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw circle...");
    }
}