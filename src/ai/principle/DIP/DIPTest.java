package ai.principle.DIP;

public class DIPTest {

    public static void main(String[] args) {
        Customer wang = new Customer();
        System.out.println("顾客购买以下商品：");
        wang.shopping(new JewelryShop());
        wang.shopping(new PearlShop());
    }
}
