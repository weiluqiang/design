package ai.yunxi.template.extend;

public class HookTemplateMethod {

    public static void main(String[] args) {
        HookAbstractClass tm = new HookConcreteClass();
        tm.templateMethod();
    }
}
