package ai.yunxi.proxy.yunxi;

//被代理类
public class FiveTeacher implements Teacher {

    @Override
    public void teach() {
        System.out.println("在云析学院上SpringCloud VIP课");
    }
}
