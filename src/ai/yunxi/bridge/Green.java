package ai.yunxi.bridge;

//扩充实现类
public class Green implements Color {

    @Override
    public void paint(String penType, String name) {
        System.out.println(penType + "绿色的" + name + ".");
    }
}
