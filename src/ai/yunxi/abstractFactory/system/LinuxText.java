package ai.yunxi.abstractFactory.system;

public class LinuxText implements Text {

    @Override
    public void getText() {
        System.out.println("LinuxText get text content");
    }
}
