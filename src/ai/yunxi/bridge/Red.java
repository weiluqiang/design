package ai.yunxi.bridge;

//扩充实现类
public class Red implements Color {

    @Override
    public void paint(String penType, String name) {
        System.out.println(penType + "红色的" + name + ".");
    }
}
