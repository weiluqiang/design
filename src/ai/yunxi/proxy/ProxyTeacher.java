package ai.yunxi.proxy;

//代理类
public class ProxyTeacher implements Teacher {

    //被代理对象
    private Teacher teacher;

    public ProxyTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void before() {
        System.out.println("上课前发放资料");
    }

    public void after() {
        System.out.println("上课后发送视频、笔记、代码...");
    }

    @Override
    public void teach() {
        this.before();
        teacher.teach();
        this.after();
    }
}
