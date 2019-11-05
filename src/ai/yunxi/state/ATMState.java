package ai.yunxi.state;

/**
 * 定义ATM机状态
 * <p>
 * ATM提供的所有接口
 * 1.插卡
 * 2.提交密码
 * 3.取款（假设取款按钮是物理键）
 * 4.查询（假设同上）
 * 5.取卡
 */
public abstract class ATMState {

    /**
     * 插卡
     */
    public abstract void insertCard();

    /**
     * 提交密码
     */
    public abstract void submitPwd();

    /**
     * 取款
     */
    public abstract void getCash();

    /**
     * 查询余额
     */
    public abstract void queryBalance();

    /**
     * 取卡
     */
    public abstract void ejectCard();
}
