package state;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-24
 * Time: 오후 5:15
 */
// Action 의 정보를 담고 있는 data
public class Action {

    private Type type;
    public enum Type {
        CLICK_ON_SWITCH, CLICK_OFF_SWITCH
    }

    public Action(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Action{" +
                "type=" + type +
                '}';
    }
}
