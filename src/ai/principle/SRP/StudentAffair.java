package ai.principle.SRP;

//学生工作
public class StudentAffair {

    //生活辅导
    public void lifeCoach(Instructor instructor) {
        instructor.classConstruct();
        instructor.attendanceCount();
        instructor.psychologyCoach();
        instructor.expenseUrge();
        instructor.classManage();
    }

    //学业指导
    public void academicAdvise(Tutor tutor) {
        tutor.majorGuide();
        tutor.studyCoach();
        tutor.researchGuide();
        tutor.studySummarize();
    }

    public static void main(String[] args) {
        StudentAffair affair = new StudentAffair();
        affair.lifeCoach(new Instructor());
        affair.academicAdvise(new Tutor());
    }
}
