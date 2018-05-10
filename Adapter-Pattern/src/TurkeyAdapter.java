import duck.Duck;
import turkey.Turkey;

/**
 * Created by IntelliJ IDEA.
 * Project: Adapter-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-11
 * Time: 오전 1:06
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
