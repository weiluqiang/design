package ai.yunxi.proxy.sample;

//代理：特产代理
public class ProxySpecialty implements Specialty {

    private WySpecialty realSubject = new WySpecialty();

    public void display() {
        preRequest();
        realSubject.display();
        postRequest();
    }

    public void preRequest() {
        System.out.println("代理婺源特产开始。");
    }

    public void postRequest() {
        System.out.println("代理婺源特产结束。");
    }
}
