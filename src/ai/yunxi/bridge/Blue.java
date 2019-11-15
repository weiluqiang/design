package ai.yunxi.bridge;

//扩充实现类
public class Blue implements Color {

    @Override
    public void paint(String penType, String name) {
        System.out.println(penType + "蓝色的" + name + ".");
    }
}
