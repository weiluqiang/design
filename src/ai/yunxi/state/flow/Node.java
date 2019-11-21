package ai.yunxi.state.flow;

/**
 * 节点接口
 */
public abstract class Node {

    private static String name; //当前节点名称

    //节点跳转
    public abstract void nodeHandle(FlowContext context);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
