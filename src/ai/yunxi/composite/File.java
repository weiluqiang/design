package ai.yunxi.composite;

//叶子节点：Leaf
public class File extends Directory {

    public File(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(this.name + " file");
    }
}
