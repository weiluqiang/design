package ai.yunxi.memento.prototype;

//带原型的备忘录模式
public class PrototypeMemento {

    public static void main(String[] args) {
        OriginatorPrototype op = new OriginatorPrototype();
        PrototypeCaretaker pc = new PrototypeCaretaker();
        op.setState("state0");
        System.out.println("原来的状态:" + op.getState());
        pc.setMemento(op.createMemento()); //保存状态
        op.setState("state1");
        System.out.println("新的状态:" + op.getState());
        op.restoreMemento(pc.getMemento()); //恢复状态
        System.out.println("恢复原来的状态:" + op.getState());
    }
}
