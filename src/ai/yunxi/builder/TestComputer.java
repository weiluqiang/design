package ai.yunxi.builder;

/**
 * 当一个类构造器需要传入很多参数时，如果创建这个类的实例，代码可读性会非常差，
 * 而且很容易引入错误，此时就可以利用builder模式进行重构
 */
public class TestComputer {

    public static void main(String[] args) {
        // 非 Builder 模式
        Computer computer = new Computer("Intel", "aoc", "kingston", "dell");
        System.out.println(computer);

        // Builder 模式
        NewComputer newComputer = new NewComputer.Builder()
                .cpu("AMD")
                .screen("DELL")
                .memory("Kingston")
                .keyboard("Razer")
                .build();
        System.out.println(newComputer);
    }
}
