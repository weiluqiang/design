package ai.yunxi.state.extend;

public class FlyweightStatePattern {

    public static void main(String[] args) {
        ShareContext context = new ShareContext(); //创建环境
        context.handle(); //处理请求
        context.handle();
        context.handle();
        context.handle();
    }
}
