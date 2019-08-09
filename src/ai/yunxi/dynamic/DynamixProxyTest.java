package ai.yunxi.dynamic;

/**
 * 动态代理
 *
 * @author : Five-云析学院
 * @since : 2019年04月17日 20:45
 */
public class DynamixProxyTest {

    public static void main(String[] args) {
        Dynamic<JavaTeacher> dynamic1 = new Dynamic<>(new FiveTeacher());
        JavaTeacher javaTeacher = dynamic1.getProxyInstance();
        javaTeacher.teachJava();

        //ProxyUtils.getClassFile(javaTeacher.getClass().getSimpleName(), JavaTeacher.class);

        Dynamic<BigDataTeacher> dynamic2 = new Dynamic<>(new SixTeacher());
        BigDataTeacher bigDataTeacher = dynamic2.getProxyInstance();
        bigDataTeacher.teachBigData();
    }
}
