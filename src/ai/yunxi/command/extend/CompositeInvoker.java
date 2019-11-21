package ai.yunxi.command.extend;

import java.util.ArrayList;

//树枝构件: 调用者
public class CompositeInvoker implements AbstractCommand {

    private ArrayList<AbstractCommand> children = new ArrayList<>();

    public void add(AbstractCommand c) {
        children.add(c);
    }

    public void remove(AbstractCommand c) {
        children.remove(c);
    }

    public AbstractCommand getChild(int i) {
        return children.get(i);
    }

    public void execute() {
        for (AbstractCommand command : children) {
            command.execute();
        }
    }
}
