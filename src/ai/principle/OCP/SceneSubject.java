package ai.principle.OCP;

public class SceneSubject implements Subject {

    @Override
    public void display() {
        System.out.println("展示风景主题的桌面");
    }
}
