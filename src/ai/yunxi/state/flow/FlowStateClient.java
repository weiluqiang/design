package ai.yunxi.state.flow;

public class FlowStateClient {

    public static void main(String[] args) {
        FlowContext context = new FlowContext();
        context.setMessage("本人王小二，因为十一家里有事情，所以要多请三天假，希望公司能够审核通过");
        context.start(context);
    }
}
