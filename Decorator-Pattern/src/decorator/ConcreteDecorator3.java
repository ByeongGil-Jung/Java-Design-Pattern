package decorator;

import component.Component;

/**
 * Created by IntelliJ IDEA.
 * Project: Decorator-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-31
 * Time: 오전 10:30
 */
public class ConcreteDecorator3 extends Decorator {

    public ConcreteDecorator3(Component basePizza) {
        super(basePizza);
    }

    @Override
    public String getName() {
        return super.getName() + " || Add Topping : Meat";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 200;
    }

    @Override
    public String description() {
        return "- Adding meat topping";
    }
}
