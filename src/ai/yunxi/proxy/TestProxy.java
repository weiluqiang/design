package ai.yunxi.proxy;

/**
 * 静态代理
 * 明星-经纪人
 *
 * @author : Five-云析学院
 * @since : 2019年04月17日 20:33
 */
public class TestProxy {

    public static void main(String[] args) {
        Teacher teacher = new ProxyTeacher(new FiveTeacher());
        teacher.teach();
    }
}
