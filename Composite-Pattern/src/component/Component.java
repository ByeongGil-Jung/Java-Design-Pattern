package component;

/**
 * Created by IntelliJ IDEA.
 * Project: Composite-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-26
 * Time: 오전 11:01
 */
public abstract class Component {

    private String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void show();
}
