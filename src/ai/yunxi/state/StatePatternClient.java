package ai.yunxi.state;

//状态模式
public class StatePatternClient {

    public static void main(String[] args) {
        Context context = new Context(); //创建环境
        context.handle();    //处理请求
        context.handle();
        context.handle();
        context.handle();
    }
}
