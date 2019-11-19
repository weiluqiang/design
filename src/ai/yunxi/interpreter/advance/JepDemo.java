package ai.yunxi.interpreter.advance;

import org.nfunk.jep.JEP;
import org.nfunk.jep.ParseException;

/**
 * Jep 是 Java expression parser 的简称，即 Java 表达式分析器，它是一个用来转换和计算数学表达式的 Java 库。
 * 通过这个程序库，用户可以以字符串的形式输入一个任意的公式，然后快速地计算出其结果。
 * 而且 Jep 支持用户自定义变量、常量和函数，它包括许多常用的数学函数和常量。
 */
public class JepDemo {

    public static void main(String[] args) throws ParseException {
        JEP jep = new JEP();
        //定义要计算的数据表达式
        String interest = "本金*利率*时间";
        //给相关变量赋值
        jep.addVariable("本金", 10000);
        jep.addVariable("利率", 0.038);
        jep.addVariable("时间", 2);
        jep.parseExpression(interest);    //解析表达式
        Object accrual = jep.getValue();    //计算
        System.out.println("存款利息：" + accrual);
    }
}
