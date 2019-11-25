package ai.principle.SRP;

//产出成品类
public class FactoryX implements IFactory {
    private Packaging packaging;

    public FactoryX(Packaging packaging) {
        this.packaging = packaging;
    }

    @Override
    public String process(String material) {
        return this.packaging.packaging(material) + "产品X";
    }
}
