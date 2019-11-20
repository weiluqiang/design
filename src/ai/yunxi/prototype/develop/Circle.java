package ai.yunxi.prototype.develop;

public class Circle implements Shape {

    public Object clone() {
        Circle w = null;
        try {
            w = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝圆失败!");
        }
        return w;
    }

    public void countArea() {
        int r = 2;
        System.out.println("这是一个圆，半径为：" + r);
        System.out.println("该圆的面积=" + 3.1415 * r * r);
    }
}
