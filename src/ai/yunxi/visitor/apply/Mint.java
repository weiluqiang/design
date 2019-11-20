package ai.yunxi.visitor.apply;

//具体访问者：造币公司
public class Mint implements Company {

    public String create(Paper element) {
        return "纸币";
    }

    public String create(Cuprum element) {
        return "铜币";
    }
}
