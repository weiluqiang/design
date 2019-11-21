package ai.yunxi.state.extend;

//具体状态1类
public class ConcreteState1 extends ShareState {

    public void handle(ShareContext context) {
        System.out.println("当前状态是： 状态1");
        context.setState(context.getState("2"));
    }
}
