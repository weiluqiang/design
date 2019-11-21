package ai.yunxi.command.breakfast;

//具体命令：馄饨
public class HunTun implements Breakfast {

    private HunTunChef receiver;

    HunTun() {
        receiver = new HunTunChef();
    }

    public void cooking() {
        receiver.cooking();
    }
}
