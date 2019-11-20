package ai.yunxi.proxy;

//代理
public class Proxy implements Subject {

    private RealSubject realSubject;

    public Proxy() {
        realSubject = new RealSubject();
    }

    public void Request() {
        preRequest();
        realSubject.Request();
        postRequest();
    }

    public void preRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }

    public void postRequest() {
        System.out.println("访问真实主题之后的后续处理。");
    }
}
