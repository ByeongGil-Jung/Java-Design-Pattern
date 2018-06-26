package element;

import element_visitor.Visitor;

/**
 * Created by IntelliJ IDEA.
 * Project: Visitor-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-06-20
 * Time: 오후 2:39
 */
public class Meat implements ItemElement {

    private String name;
    private int pricePerKg;
    private int weight;

    public Meat(String name, int pricePerKg, int weight) {
        this.name = name;
        this.pricePerKg = pricePerKg;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
