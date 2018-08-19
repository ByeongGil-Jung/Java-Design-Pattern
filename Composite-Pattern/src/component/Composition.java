package component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project: Composite-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-26
 * Time: 오전 11:01
 */
public class Composition extends Component {

    private List<Component> list = new ArrayList<>();

    public Composition(String name) {
        super(name);
    }

    public void add(Component component) {
        list.add(component);
    }

    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void show() {
        System.out.println("┏ " + getName());
        for (Component component : list) {
            component.show();
        }
    }
}
