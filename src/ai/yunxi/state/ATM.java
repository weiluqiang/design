package ai.yunxi.state;

/**
 * ATM机
 */
public class ATM {

    /*所有状态*/
    private ATMState readyState;
    private ATMState noCashState;
    private ATMState noServiceState;

    private ATMState currState;//当前状态
    private int totalAmount;//机内现钞总数

    /*测试用的临时变量*/
    private String pwd;//密码
    private int balance;//余额
    private int amount;//取款金额

    public ATM(int totalAmount, int balance, int amount, String pwd) throws Exception {
        //初始化所有状态
        readyState = new ReadyState(this);
        noCashState = new NoCashState(this);
        noServiceState = new NoServiceState(this);

        if (totalAmount > 0) {
            currState = readyState;
        } else if (totalAmount == 0) {
            currState = noCashState;
        } else {
            throw new Exception();
        }

        //初始化测试数据
        this.totalAmount = totalAmount;
        this.balance = balance;
        this.amount = amount;
        this.pwd = pwd;
    }

    /*把具体行为委托给状态对象*/

    /**
     * 插卡
     */
    public void insertCard() {
        currState.insertCard();
    }

    /**
     * 提交密码
     */
    public void submitPwd() {
        currState.submitPwd();
    }

    /**
     * 取款
     */
    public void getCash() {
        currState.getCash();
    }

    /**
     * 查询余额
     */
    public void queryBalance() {
        currState.queryBalance();
    }

    /**
     * 取卡
     */
    public void ejectCard() {
        currState.ejectCard();
    }

    public String toString() {
        return "现钞总数￥" + totalAmount;
    }

    public ATMState getReadyState() {
        return readyState;
    }

    public void setReadyState(ATMState readyState) {
        this.readyState = readyState;
    }

    public ATMState getNoCashState() {
        return noCashState;
    }

    public void setNoCashState(ATMState noCashState) {
        this.noCashState = noCashState;
    }

    public ATMState getNoServiceState() {
        return noServiceState;
    }

    public void setNoServiceState(ATMState noServiceState) {
        this.noServiceState = noServiceState;
    }

    public ATMState getCurrState() {
        return currState;
    }

    public void setCurrState(ATMState currState) {
        this.currState = currState;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
