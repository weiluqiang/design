package ai.yunxi.state.extend;

import java.util.HashMap;
import java.util.Map;

//环境类
public class ShareContext {

    private ShareState state;
    private Map<String, ShareState> stateSet = new HashMap<>();

    public ShareContext() {
        state = new ConcreteState1();
        stateSet.put("1", state);
        state = new ConcreteState2();
        stateSet.put("2", state);
        state = getState("1");
    }

    //设置新状态
    public void setState(ShareState state) {
        this.state = state;
    }

    //读取状态
    public ShareState getState(String key) {
        return stateSet.get(key);
    }

    //对请求做处理
    public void handle() {
        state.handle(this);
    }
}
