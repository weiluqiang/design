package ai.yunxi.builder;

public class NewComputer {

    private String cpu;
    private String screen;
    private String memory;
    private String keyboard;

    private NewComputer(Builder builder) {
        cpu = builder.cpu;
        screen = builder.screen;
        memory = builder.memory;
        keyboard = builder.keyboard;
    }

    @Override
    public String toString() {
        return "NewComputer{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String keyboard;

        public Builder() {
        }

        public Builder cpu(String val) {
            cpu = val;
            return this;
        }

        public Builder screen(String val) {
            screen = val;
            return this;
        }

        public Builder memory(String val) {
            memory = val;
            return this;
        }

        public Builder keyboard(String val) {
            keyboard = val;
            return this;
        }

        public NewComputer build() {
            return new NewComputer(this);
        }
    }
}
