package observer_pattern_custom;

import observer_pattern_custom.observers.Observer;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-21
 * Time: 오후 7:32
 */
public interface Observable {

    public void addObserver(Observer observer);

    public void deleteObserver(Observer observer);

    public void notifyObserver();
}
