package weapon;

/**
 * Created by IntelliJ IDEA.
 * Project: Strategy-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-08
 * Time: 오전 10:57
 */
public class Ax implements Weapon {
    @Override
    public void doAction() {
        System.out.println("Ax : action");
    }
}
