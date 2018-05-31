package decorator;

import component.Component;

/**
 * Created by IntelliJ IDEA.
 * Project: Decorator-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-31
 * Time: 오전 10:24
 */
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component basePizza) {
        super(basePizza);
    }

    @Override
    public String getName() {
        return super.getName() + " || Add Topping : Tomato";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 50;
    }

    @Override
    public String description() {
        return "- Adding tomato topping";
    }
}
