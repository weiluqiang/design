package ai.yunxi.decorate;

public class TestDecorate {

    public static void main(String[] args) {
        String password = "Jiqing9006";

        Cipher sc = new SimpleCipher();
        System.out.println(sc.encrypt(password));

        Cipher cc = new ComplexCipher(sc);
        System.out.println(cc.encrypt(password));

        Cipher ac = new AdvancedCipher(cc);
        System.out.println(ac.encrypt(password));
    }
}
