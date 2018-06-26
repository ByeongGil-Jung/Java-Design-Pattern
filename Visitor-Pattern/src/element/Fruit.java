package element;

import element_visitor.Visitor;

/**
 * Created by IntelliJ IDEA.
 * Project: Visitor-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-06-20
 * Time: 오후 2:40
 */
public class Fruit implements ItemElement {

    private String name;
    private int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
