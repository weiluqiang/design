package ai.yunxi.state.extend;

//具体状态2类
public class ConcreteState2 extends ShareState {

    public void handle(ShareContext context) {
        System.out.println("当前状态是： 状态2");
        context.setState(context.getState("1"));
    }
}
