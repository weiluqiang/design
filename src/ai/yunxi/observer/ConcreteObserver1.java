package ai.yunxi.observer;

//具体观察者1
public class ConcreteObserver1 implements Observer {

    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}
