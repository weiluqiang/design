package ai.yunxi.bridge;

//桥接模式
public class BridgeClient {

    public static void main(String[] args) {
        Color red = new Red();
        Pen small = new SmallPen();
        small.setColor(red);
        small.draw("鲜花");

        Color green = new Green();
        Pen big = new BigPen();
        big.setColor(green);
        big.draw("树叶");
    }
}
