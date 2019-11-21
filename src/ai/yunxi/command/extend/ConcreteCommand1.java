package ai.yunxi.command.extend;

//树叶构件: 具体命令1
public class ConcreteCommand1 implements AbstractCommand {

    private CompositeReceiver receiver;

    ConcreteCommand1() {
        receiver = new CompositeReceiver();
    }

    public void execute() {
        receiver.action1();
    }
}
