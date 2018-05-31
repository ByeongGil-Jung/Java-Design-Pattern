package decorator;

import component.Component;

/**
 * Created by IntelliJ IDEA.
 * Project: Decorator-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-31
 * Time: 오전 9:31
 */
public abstract class Decorator implements Component {

    private Component basePizza;

    public Decorator(Component basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public String getName() {
        return basePizza.getName();
    }

    @Override
    public int getPrice() {
        return basePizza.getPrice();
    }

    public abstract String description();

}
