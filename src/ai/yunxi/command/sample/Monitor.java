package ai.yunxi.command.sample;

//班长(调用者)
public class Monitor {

    Command command;

    public Monitor() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    // 发布通知
    public void releasingNotice() {
        command.execute();
    }
}
