package ai.yunxi.bridge.pen;

//扩充抽象类
public class MiddlePen extends Pen {

    @Override
    public void draw(String name) {
        String penType = "中号毛笔绘制";
        this.color.paint(penType, name);
    }
}
