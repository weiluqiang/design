package ai.yunxi.composite.sample;

//组合模式
public class CompositeClient {

    public static void main(String[] args) {
        Folder diskC = new Folder("C:\\");
        Folder windows = new Folder("---Windows");
        Folder system32 = new Folder("------system32");
        File calcFile = new File("---------calc.exe");
        File pingFile = new File("---------ping.exe");

        diskC.addDir(windows);
        windows.addDir(system32);
        system32.addDir(calcFile);
        system32.addDir(pingFile);

        diskC.print();
    }
}
