package memento;

import memento.State.IState;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-29
 * Time: 오후 4:11
 */
public class Originator {

    private IState state;

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public Memento saveMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }
}
