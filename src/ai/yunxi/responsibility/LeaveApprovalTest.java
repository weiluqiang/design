package ai.yunxi.responsibility;

//责任链模式
public class LeaveApprovalTest {

    public static void main(String[] args) {
        //组装责任链
        Leader teacher1 = new ClassAdviser();
        Leader teacher2 = new DepartmentHead();
        Leader teacher3 = new Dean();
        Leader teacher4 = new DeanOfStudies();
        teacher1.setNext(teacher2);
        teacher2.setNext(teacher3);
        teacher3.setNext(teacher4);
        //提交请求
        teacher1.handleRequest(2);
        teacher1.handleRequest(7);
        teacher1.handleRequest(10);
        teacher1.handleRequest(20);
    }
}
