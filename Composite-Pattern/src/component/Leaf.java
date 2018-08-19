package component;

/**
 * Created by IntelliJ IDEA.
 * Project: Composite-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-26
 * Time: 오전 11:01
 */
public class Leaf extends Component {

    private Object date;

    public Leaf(String name) {
        super(name);
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    @Override
    public void show() {
        System.out.println(getName());
    }
}
