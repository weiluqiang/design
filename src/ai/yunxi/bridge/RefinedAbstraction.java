package ai.yunxi.bridge;

//扩展抽象化角色
public class RefinedAbstraction extends Abstraction {

    protected RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    public void operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        impl.operationImpl();
    }
}
