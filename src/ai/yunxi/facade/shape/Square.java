package ai.yunxi.facade.shape;

/**
 * 子系统(SubSystem)角色
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("draw square...");
    }
}
