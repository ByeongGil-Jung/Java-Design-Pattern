package decorator;

import component.Component;

/**
 * Created by IntelliJ IDEA.
 * Project: Decorator-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-31
 * Time: 오전 9:32
 */
public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component basePizza) {
        super(basePizza);
    }

    @Override
    public String getName() {
        return super.getName() + " || Add Topping : Cheese";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 100;
    }

    @Override
    public String description() {
        return "- Adding cheese topping";
    }
}
