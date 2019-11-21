package ai.yunxi.command.breakfast;

//具体命令：河粉
public class HeFen implements Breakfast {

    private HeFenChef receiver;

    HeFen() {
        receiver = new HeFenChef();
    }

    public void cooking() {
        receiver.cooking();
    }
}
