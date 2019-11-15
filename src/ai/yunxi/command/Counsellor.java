package ai.yunxi.command;

//辅导员(客户)
public class Counsellor {

    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        Student studentOne = new Student();
        LectureCommand lectureCommandOne = new LectureCommand(studentOne);
        Student studentTwo = new Student();
        MeetCommand meetCommand = new MeetCommand(studentTwo);
        SubmitMaterialCommand submitMaterialCommand = new SubmitMaterialCommand(studentTwo);

        // 一班听讲座
        monitor.setCommand(lectureCommandOne);
        monitor.releasingNotice();

        // 二班开班会，提交材料
        monitor.setCommand(meetCommand);
        monitor.releasingNotice();
        monitor.setCommand(submitMaterialCommand);
        monitor.releasingNotice();
    }
}
