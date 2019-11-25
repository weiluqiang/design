package ai.principle.OCP;

public class FigureSubject implements Subject {

    @Override
    public void display() {
        System.out.println("展示人物主题的桌面");
    }
}
