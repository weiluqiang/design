package ai.yunxi.mediator.example;

//具体同事类：买方
public class Buyer extends Customer {

    public Buyer(String name) {
        super(name);
    }

    public void send(String ad) {
        System.out.println("我(买方)说: " + ad);
        medium.relay(name, ad);
    }

    public void receive(String from, String ad) {
        System.out.println(from + "说: " + ad);
    }
}
