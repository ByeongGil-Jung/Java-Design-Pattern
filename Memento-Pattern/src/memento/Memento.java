package memento;

import memento.State.IState;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-29
 * Time: 오후 3:59
 */
// 외부에서 Memento 를 직접 handling 할 수 없도록 접근 제한자를 걸어둔다.
// (혹시라도 다른 package 에서 Memento 를 상속받아 활용할 수 있으므로, 클래스는 public 으로 만든다.)
public class Memento {

    private IState state;

    protected Memento(IState state) {
        this.state = state;
    }

    protected IState getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "state=" + state +
                '}';
    }
}
