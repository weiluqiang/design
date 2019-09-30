package ai.yunxi.factory.abstractFactory;

public class LinuxButton implements Button {

    @Override
    public void processEvent() {
        System.out.println("LinuxButton process click event");
    }
}
