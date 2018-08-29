package memento.State;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-29
 * Time: 오후 4:50
 */
public class State implements IState {

    private String name;

    public State(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
