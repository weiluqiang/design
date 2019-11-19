package ai.yunxi.interpreter;

//抽象表达式类
public interface AbstractExpression {

    Object interpret(String info);//解释方法
}
