package ai.yunxi.observer;

//具体目标
public class ConcreteSubject extends Subject {

    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");

        for (Observer observer : observers) {
            observer.response();
        }
    }
}
