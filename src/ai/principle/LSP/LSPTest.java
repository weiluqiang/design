package ai.principle.LSP;

public class LSPTest {

    public static void main(String[] args) {
        Bird1 bird1 = new Swallow1();
        Bird1 bird2 = new BrownKiwi1();
        bird1.setSpeed(120);
        bird2.setSpeed(120);

        //如果几维鸟直接继承鸟类，则程序执行返回错误信息
        System.out.println("如果飞行300公里：");
        try {
            System.out.println("燕子将飞行" + bird1.getFlyTime(300) + "小时.");
            System.out.println("几维鸟将飞行" + bird2.getFlyTime(300) + "小时。");
        } catch (Exception err) {
            System.out.println("发生错误了!");
        }

        //几维鸟直接继承动物类，程序正常执行
        Bird2 bird = new Swallow2();
        bird.setFlySpeed(120);
        Animal animal = new BrownKiwi2();
        animal.setRunSpeed(120);
        System.out.println("如果飞行300公里：");
        try {
            System.out.println("燕子将飞行" + bird.getFlyTime(300) + "小时.");
            System.out.println("几维鸟将跑" + animal.getRunTime(300) + "小时。");
        } catch (Exception err) {
            System.out.println("发生错误了!");
        }
    }
}
