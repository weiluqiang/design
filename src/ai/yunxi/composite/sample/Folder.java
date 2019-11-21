package ai.yunxi.composite.sample;

import java.util.ArrayList;
import java.util.List;

//树枝节点：Composite
public class Folder extends Directory {

    private List<Directory> mDirs;

    public Folder(String name) {
        super(name);
        this.mDirs = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println(this.name + " Folder");
        for (Directory dir : this.mDirs) {
            dir.print();
        }
    }

    public boolean addDir(Directory dir) {
        return this.mDirs.add(dir);
    }

    public boolean removeDir(Directory dir) {
        return this.mDirs.remove(dir);
    }

    public Directory getDir(int index) {
        return this.mDirs.get(index);
    }
}
