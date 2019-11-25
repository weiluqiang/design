package ai.principle.SRP;

//包装类
public class Packaging implements IPackaging {
    private IProcess process;

    public Packaging(IProcess process) {
        this.process = process;
    }

    @Override
    public String packaging(String material) {
        return this.process.process(material) + "包装——>";
    }
}
