package ai.yunxi.responsibility;

//抽象处理者：领导类
public abstract class Leader {

    private Leader next;

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }

    //处理请求的方法
    public abstract void handleRequest(int LeaveDays);
}
