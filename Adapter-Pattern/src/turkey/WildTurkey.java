package turkey;

/**
 * Created by IntelliJ IDEA.
 * Project: Adapter-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-11
 * Time: 오전 1:03
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble ~ Gobble ~");
    }

    @Override
    public void fly() {
        System.out.println("I can fly shortly !");
    }
}
