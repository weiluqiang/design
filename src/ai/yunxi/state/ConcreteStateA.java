package ai.yunxi.state;

//具体状态A类
public class ConcreteStateA extends State {

    public void handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
