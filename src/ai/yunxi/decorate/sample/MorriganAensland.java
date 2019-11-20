package ai.yunxi.decorate.sample;

public class MorriganAensland {

    public static void main(String[] args) {
        Morrigan m0 = new Original();
        m0.display();
        Morrigan m1 = new Succubus(m0);
        m1.display();
        Morrigan m2 = new Girl(m0);
        m2.display();
    }
}
