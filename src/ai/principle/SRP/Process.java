package ai.principle.SRP;

//加工类
public class Process implements IProcess {
    private IPreProcess preProcess;

    public Process(IPreProcess preProcess) {
        this.preProcess = preProcess;
    }

    @Override
    public String process(String material) {
        return this.preProcess.preProcess(material) + "加工——>";
    }
}
