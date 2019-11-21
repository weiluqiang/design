package ai.yunxi.command.extend;

//树叶构件: 具体命令2
public class ConcreteCommand2 implements AbstractCommand {

    private CompositeReceiver receiver;

    ConcreteCommand2() {
        receiver = new CompositeReceiver();
    }

    public void execute() {
        receiver.action2();
    }
}
