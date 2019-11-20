package ai.yunxi.visitor.apply;

//具体元素：铜
public class Cuprum implements Material {

    public String accept(Company visitor) {
        return (visitor.create(this));
    }
}
