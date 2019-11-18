package ai.yunxi.mediator.example;

//中介者模式-地产交易平台
public class BusinessPlatform {

    public static void main(String[] args) {
        Medium md = new EstateMedium();//房产中介
        Customer seller, buyer;
        seller = new Seller("张三(卖方)");
        buyer = new Buyer("李四(买方)");
        md.register(seller);//客户注册
        md.register(buyer);//客户注册

        seller.send("出售房屋");
        buyer.send("求购房屋");
    }
}
