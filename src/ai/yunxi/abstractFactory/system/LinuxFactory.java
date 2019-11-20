package ai.yunxi.abstractFactory.system;

public class LinuxFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Text createText() {
        return new LinuxText();
    }
}
