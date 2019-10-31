package ai.yunxi.facade;

/**
 * 外观(Facade)角色
 */
public class ShapeMaker {

    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapeMaker() {
        this.circle = new Circle();
        this.square = new Square();
        this.rectangle = new Rectangle();
    }

    public void drawAll() {
        circle.draw();
        square.draw();
        rectangle.draw();
    }
}
