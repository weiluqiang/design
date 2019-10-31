package ai.yunxi.facade;

/**
 * 子系统(SubSystem)角色
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw rectangle...");
    }
}
