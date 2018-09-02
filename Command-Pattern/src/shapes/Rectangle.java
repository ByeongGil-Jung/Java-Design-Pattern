package shapes;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-09-01
 * Time: 오후 2:07
 */
public class Rectangle implements IShape {

    @Override
    public void draw() {
        System.out.println("[Rectangle] Drawing");
    }

    @Override
    public void undraw() {
        System.out.println("[Rectangle] Undrawing");
    }
}
