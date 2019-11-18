package ai.yunxi.mediator.simple;

//具体同事类
public class SimpleConcreteColleague2 implements SimpleColleague {

    SimpleConcreteColleague2() {
        SimpleMediator smd = SimpleMediator.getMedium();
        smd.register(this);
    }

    public void receive() {
        System.out.println("具体同事类2：收到请求。");
    }

    public void send() {
        SimpleMediator smd = SimpleMediator.getMedium();
        System.out.println("具体同事类2：发出请求...");
        smd.relay(this); //请中介者转发
    }
}
