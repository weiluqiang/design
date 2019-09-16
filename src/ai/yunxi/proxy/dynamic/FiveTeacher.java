package ai.yunxi.proxy.dynamic;

//被代理类
public class FiveTeacher implements JavaTeacher {

    @Override
    public void teachJava() {
        System.out.println("在云析学院上SpringCloud VIP课");
    }
}
