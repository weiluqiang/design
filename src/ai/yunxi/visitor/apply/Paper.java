package ai.yunxi.visitor.apply;

//具体元素：纸
public class Paper implements Material {

    public String accept(Company visitor) {
        return (visitor.create(this));
    }
}
