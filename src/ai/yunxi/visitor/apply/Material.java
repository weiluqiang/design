package ai.yunxi.visitor.apply;

//抽象元素：材料
public interface Material {

    String accept(Company visitor);
}
