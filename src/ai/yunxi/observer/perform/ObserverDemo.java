package ai.yunxi.observer.perform;

/**
 * 观察者模式
 *
 * @author : Five-云析学院
 * @since : 2019年04月17日 20:10
 */
public class ObserverDemo {

    public static void main(String[] args) {
        //来了一个小丑
        Clown clown = new Clown(); //观众入场了
        for (int i = 0; i < 3; i++) {
            Viewer v = new Viewer(i);
            clown.addObserver(v);
            System.out.println("座号为" + v.getSeatNo() + "的观众入座");
        }
        //小丑开始表演
        clown.perform();
        //小丑表演完毕，退场
        clown.exit();
    }
}
