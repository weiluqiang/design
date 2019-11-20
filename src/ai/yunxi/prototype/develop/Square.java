package ai.yunxi.prototype.develop;

public class Square implements Shape {

    public Object clone() {
        Square b = null;
        try {
            b = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝正方形失败!");
        }
        return b;
    }

    public void countArea() {
        int a = 2;
        System.out.println("这是一个正方形，边长为：" + a);
        System.out.println("该正方形的面积=" + a * a);
    }
}
