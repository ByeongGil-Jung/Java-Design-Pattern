package component;

/**
 * Created by IntelliJ IDEA.
 * Project: Decorator-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-31
 * Time: 오전 9:31
 */
public class ConcreteComponent implements Component {

    @Override
    public String getName() {
        return "Basic Pizza";
    }

    @Override
    public int getPrice() {
        return 500;
    }
}
