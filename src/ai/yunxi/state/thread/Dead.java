package ai.yunxi.state.thread;

//具体状态类：死亡状态
public class Dead extends ThreadState {

    public Dead() {
        stateName = "死亡状态";
        System.out.println("当前线程处于：死亡状态.");
    }
}
