package ai.yunxi.visitor.apply;

//具体访问者：艺术公司
public class ArtCompany implements Company {

    public String create(Paper element) {
        return "星月夜";
    }

    public String create(Cuprum element) {
        return "马首铜像";
    }
}
