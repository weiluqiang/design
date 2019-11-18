package ai.yunxi.mediator.example;

//具体同事类：卖方
public class Seller extends Customer {

    public Seller(String name) {
        super(name);
    }

    public void send(String ad) {
        System.out.println("我(卖方)说: " + ad);
        medium.relay(name, ad);
    }

    public void receive(String from, String ad) {
        System.out.println(from + "说: " + ad);
    }
}
