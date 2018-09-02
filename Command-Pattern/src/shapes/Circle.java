package shapes;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-09-01
 * Time: 오후 2:06
 */
public class Circle implements IShape {

    @Override
    public void draw() {
        System.out.println("[Circle] Drawing");
    }

    @Override
    public void undraw() {
        System.out.println("[Circle] Undrawing");
    }
}
