package ai.yunxi.state;

//具体状态B类
public class ConcreteStateB extends State {

    public void handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}
