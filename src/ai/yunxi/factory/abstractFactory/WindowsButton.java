package ai.yunxi.factory.abstractFactory;

public class WindowsButton implements Button {

    @Override
    public void processEvent() {
        System.out.println("WindowsButton process click event");
    }
}
