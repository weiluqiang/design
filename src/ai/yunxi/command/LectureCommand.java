package ai.yunxi.command;

//讲座通知
public class LectureCommand implements Command {

    private Student student;

    public LectureCommand(Student student) {
        this.student = student;
    }

    @Override
    public void execute() {
        student.attendLecture();
    }
}
