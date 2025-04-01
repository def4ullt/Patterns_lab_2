package BehavioralPatterns.Command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Command> orderList = new ArrayList<Command>();

    public void takeOrder(Command order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Command order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
