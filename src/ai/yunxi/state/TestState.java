package ai.yunxi.state;

/**
 * 状态模式
 */
public class TestState {

    public static void main(String[] args) {
        /*测试数据*/
        /* 机内总数	 账户余额	 取款金额	密码
         * 1000	     500         200		123
         * 1000	     300         500		123
         * 0	     500		 200		123
         * */
        try {
            test(1000, 500, 200, "123");
            System.out.println("-------");
            test(1000, 300, 500, "123");
            System.out.println("-------");
            test(0, 500, 200, "123");
        } catch (Exception e) {
            System.out.println("机器故障，维修请求已经发送至维修方");
        }
    }

    private static void test(int totalAmount, int balance, int amount, String pwd) throws Exception {
        //创建ATM
        ATM atm;
        atm = new ATM(totalAmount, balance, amount, pwd);
        //输出初始状态
        System.out.println(atm.toString());
        atm.insertCard();
        atm.submitPwd();
        atm.getCash();
        //输出结束状态
        System.out.println(atm.toString());
    }
}
