package ai.yunxi.facade;

/**
 * 外观模式
 */
public class TestClient {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawAll();
    }
}
