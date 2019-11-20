package ai.yunxi.visitor.apply;

//抽象访问者:公司
public interface Company {

    String create(Paper element);

    String create(Cuprum element);
}
