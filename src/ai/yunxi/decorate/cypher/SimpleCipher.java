package ai.yunxi.decorate.cypher;

// 简单密文接口实现类
public class SimpleCipher implements Cipher {

    @Override
    // 用后6位字母代替当前字母
    public String encrypt(String plainText) {
        String str = "";
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c += 6;
                if (c > 'z') c -= 26;
                if (c < 'a') c += 26;
            }
            if (c >= 'A' && c <= 'Z') {
                c += 6;
                if (c > 'Z') c -= 26;
                if (c < 'A') c += 26;
            }
            str += c;
        }
        return str;
    }
}
