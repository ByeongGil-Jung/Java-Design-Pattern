package element_visitor;

import element.Fruit;
import element.Meat;

/**
 * Created by IntelliJ IDEA.
 * Project: Visitor-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-06-20
 * Time: 오후 11:05
 */
public class ShopVisitor implements Visitor {

    @Override
    public int visit(Meat meat) {
        int totalPrice = 0;

        System.out.println("Visit Name :: " + meat.getName());
        totalPrice = meat.getPricePerKg() * meat.getWeight();

        return totalPrice;
    }

    @Override
    public int visit(Fruit fruit) {
        int price = 0;

        System.out.println("Visit Name :: " + fruit.getName());
        price = fruit.getPrice();

        return price;
    }
}
