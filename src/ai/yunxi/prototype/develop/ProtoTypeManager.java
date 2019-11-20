package ai.yunxi.prototype.develop;

import java.util.HashMap;

//原型管理器
public class ProtoTypeManager {

    private HashMap<String, Shape> ht = new HashMap<>();

    public ProtoTypeManager() {
        ht.put("Circle", new Circle());
        ht.put("Square", new Square());
    }

    public void addShape(String key, Shape obj) {
        ht.put(key, obj);
    }

    public Shape getShape(String key) {
        Shape temp = ht.get(key);
        return (Shape) temp.clone();
    }
}
