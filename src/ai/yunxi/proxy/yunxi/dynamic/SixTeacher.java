package ai.yunxi.proxy.yunxi.dynamic;

//被代理类
public class SixTeacher implements BigDataTeacher {

    @Override
    public void teachBigData() {
        System.out.println("在云析学院上大数据VIP课");
    }
}
