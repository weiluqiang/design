package ai.yunxi.memento.date;

//管理者：美女栈
public class GirlStack {

    private Girl girl[];
    private int top;

    GirlStack() {
        girl = new Girl[5];
        top = -1;
    }

    public boolean push(Girl p) {
        if (top >= 4) {
            System.out.println("你太花心了，变来变去的！");
            return false;
        } else {
            girl[++top] = p;
            return true;
        }
    }

    public Girl pop() {
        if (top <= 0) {
            System.out.println("美女栈空了！");
            return girl[0];
        } else {
            return girl[top--];
        }
    }
}
