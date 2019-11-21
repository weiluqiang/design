package ai.yunxi.template;

//模板方法模式
public class TemplateMethodPattern {

    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClassA();
        tm.templateMethod();

        tm = new ConcreteClassB();
        tm.templateMethod();
    }
}
