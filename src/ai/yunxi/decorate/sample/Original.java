package ai.yunxi.decorate.sample;

//具体构件角色：原身
public class Original implements Morrigan {

    private String t = "Morrigan0.jpg";

    public void setImage(String t) {
        this.t = t;
    }

    public void display() {
        System.out.println("现在的样式是：" + t);
    }
}
