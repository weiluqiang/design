package ai.yunxi.observer.rate;

import java.util.ArrayList;
import java.util.List;

//抽象目标：汇率
public abstract class Rate {

    protected List<Company> companies = new ArrayList<>();

    //增加观察者方法
    public void add(Company company) {
        companies.add(company);
    }

    //删除观察者方法
    public void remove(Company company) {
        companies.remove(company);
    }

    public abstract void change(int number);
}
