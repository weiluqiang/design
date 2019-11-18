package ai.yunxi.mediator.example;

import java.util.ArrayList;
import java.util.List;

//具体中介者：房地产中介
public class EstateMedium implements Medium {

    private List<Customer> members = new ArrayList<>();

    public void register(Customer member) {
        if (!members.contains(member)) {
            members.add(member);
            member.setMedium(this);
        }
    }

    public void relay(String from, String ad) {
        for (Customer ob : members) {
            String name = ob.getName();
            if (!name.equals(from)) {
                ob.receive(from, ad);
            }
        }
    }
}
