package ai.principle.DIP;

//将司机模块抽象为一个接口
public interface IDriver {

    //是司机就应该会驾驶汽车
    void drive(ICar car);
}
