package ai.yunxi.command.sample;

//开会通知
public class MeetCommand implements Command {

    private Student student;

    public MeetCommand(Student student) {
        this.student = student;
    }

    @Override
    public void execute() {
        student.meeting();
    }
}
