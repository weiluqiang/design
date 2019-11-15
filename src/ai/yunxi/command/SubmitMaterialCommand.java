package ai.yunxi.command;

//提交材料通知
public class SubmitMaterialCommand implements Command {

    private Student student;

    public SubmitMaterialCommand(Student student) {
        this.student = student;
    }

    @Override
    public void execute() {
        student.submitMaterial();
    }
}
