package ai.yunxi.state.flow;

/**
 * 流程控制
 */
public class FlowContext {

    private boolean flag; // 代表流程是否结束
    /**
     * 流程状态 0：通过 1:驳回 2.退回整改 3.已申请
     */
    private int status;
    private String message; // 消息
    private Node node; // 节点信息

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public static boolean start(FlowContext context) {
        Node node = new LeaderNode();
        context.setNode(node); // 设置初始节点
        context.setStatus(3); // 设置状态为申请中
        context.getNode().nodeHandle(context); // 发起请求
        // 最后要知道是否申请成功
        //判断当前是最后一个节点并且审核通过，而且流程结束
        if ("HR李".equals(node.getName()) && 0 == context.getStatus() && context.isFlag()) {
            System.out.println("审核通过，流程结束");
            return true;
        } else {
            System.out.println("审核未通过，流程已经结束");
            return false;
        }
    }

    public FlowContext() {
        super();
    }
}
