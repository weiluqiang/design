package ai.yunxi.decorate;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;

// 复杂加密装饰者
public class ComplexCipher extends CipherDecorator {

    public ComplexCipher(Cipher cipher) {
        super(cipher);
    }

    // 在父类加密的基础上，再反转整个字符串
    @Override
    public String encrypt(String plainText) {
        return this.reverse(super.encrypt(plainText));
    }

    // 字符串反转
    private String reverse(String plainText) {
        char[] vals = plainText.toCharArray();
        for (int i = 0, j = vals.length - 1, mid = vals.length >> 1; i < mid; i++, j--) {
            char tmp = vals[j];
            vals[j] = vals[i];
            vals[i] = tmp;
        }
        return new String(vals);
    }
}
