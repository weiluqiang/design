package ai.yunxi.builder;

public class Computer {

    private String cpu;
    private String screen;
    private String memory;
    private String keyboard;

    public Computer(String cpu, String screen, String memory, String keyboard) {
        this.cpu = cpu;
        this.screen = screen;
        this.memory = memory;
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }
}
