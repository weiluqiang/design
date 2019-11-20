package ai.yunxi.decorate.cypher;

// 先进加密装饰者
public class AdvancedCipher extends CipherDecorator {

    public AdvancedCipher(Cipher cipher) {
        super(cipher);
    }

    @Override
    public String encrypt(String plainText) {
        return this.mod(super.encrypt(plainText));
    }

    // 对字符串的ASC码值取模
    private String mod(String plainText) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            // 相当于 num % 8
            sb.append(plainText.charAt(i) & 0b111);
        }
        return sb.toString();
    }
}
