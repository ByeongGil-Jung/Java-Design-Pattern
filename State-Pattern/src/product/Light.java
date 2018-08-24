package product;

import state.Action;
import state.State;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-24
 * Time: 오후 5:49
 */
public class Light implements Product {

    private State currentState = State.OFF;

    public Light() {
    }

    public boolean changeState(Action action) {
        State changedState = currentState.act(action);

        // Print parts
        changedState.notifyMode();
        if (currentState == changedState)
            System.out.println("- No change in state");
        else {
            System.out.println(String.format("Because of %s, %s_state changed to %s_state",
                    action, currentState, changedState));
        }

        currentState = changedState;
        return true;
    }
}
