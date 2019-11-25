package ai.principle.OCP;

public class WindowsDesktop {

    private Subject subject;

    public void display() {
        subject = new SceneSubject();
        subject.display();

        subject = new FigureSubject();
        subject.display();
    }

    public static void main(String[] args) {
        WindowsDesktop windows = new WindowsDesktop();
        windows.display();
    }
}
