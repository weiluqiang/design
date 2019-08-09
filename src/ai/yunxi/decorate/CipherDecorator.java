package ai.yunxi.decorate;

// 密文装饰者
public class CipherDecorator implements Cipher {

    private Cipher cipher;

    public CipherDecorator(Cipher cipher) {
        this.cipher = cipher;
    }

    @Override
    public String encrypt(String plainText) {
        return cipher.encrypt(plainText);
    }
}
