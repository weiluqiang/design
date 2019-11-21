package ai.yunxi.observer.rate;

//具体目标：人民币汇率
public class RMBRate extends Rate {

    public void change(int number) {
        for (Company company : companies) {
            company.response(number);
        }
    }
}
