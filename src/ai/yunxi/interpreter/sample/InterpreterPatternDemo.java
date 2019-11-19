package ai.yunxi.interpreter.sample;

/*文法规则
  <expression> ::= <city>的<person>
  <city> ::= 北京|天津
  <person> ::= 老人|妇女|儿童
*/
public class InterpreterPatternDemo {

    public static void main(String[] args) {
        Context bus = new Context();
        bus.freeRide("北京的老人");
        bus.freeRide("北京的年轻人");
        bus.freeRide("天津的妇女");
        bus.freeRide("天津的儿童");
        bus.freeRide("山东的儿童");
    }
}
