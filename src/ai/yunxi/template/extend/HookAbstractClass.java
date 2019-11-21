package ai.yunxi.template.extend;

//含钩子方法的抽象类
public abstract class HookAbstractClass {

    public void templateMethod() { //模板方法
        abstractMethod1();
        HookMethod1();
        if (HookMethod2()) {
            specificMethod();
        }
        abstractMethod2();
    }

    public void specificMethod() { //具体方法
        System.out.println("抽象类中的具体方法被调用...");
    }

    public void HookMethod1() { //钩子方法1
        System.out.println("抽象类中的钩子方法1被调用...");
    }

    public boolean HookMethod2() { //钩子方法2
        return true;
    }

    public abstract void abstractMethod1(); //抽象方法1

    public abstract void abstractMethod2(); //抽象方法2
}
