package memento;

import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-29
 * Time: 오후 4:31
 */
public class CareTaker {

    private Stack<Memento> mementos = new Stack<>();

    public void addMemento(Memento memento) {
        mementos.push(memento);
    }

    public Memento popMemento() {
        return mementos.pop();
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }

    @Override
    public String toString() {
        return "CareTaker{" +
                mementos +
                '}';
    }
}
