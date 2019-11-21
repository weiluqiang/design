package ai.yunxi.command.breakfast;

public class CookingCommand {

    public static void main(String[] args) {
        Breakfast food1 = new ChangFen();
        Breakfast food2 = new HunTun();
        Breakfast food3 = new HeFen();
        Waiter waiter = new Waiter();
        waiter.setChangFen(food1);//设置肠粉菜单
        waiter.setHunTun(food2);  //设置河粉菜单
        waiter.setHeFen(food3);   //设置馄饨菜单
        waiter.chooseChangFen();  //下单肠粉
        waiter.chooseHeFen();     //下单河粉
        waiter.chooseHunTun();    //下单馄饨
    }
}
