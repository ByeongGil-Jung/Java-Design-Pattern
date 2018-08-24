package state;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-24
 * Time: 오후 5:04
 */

/*
Enum 에선, 자체적으로 내부에서 추상 메소드를 정의할 수 있다.
이 경우, Enum 의 값에 따라 메소드를 Override 하여 다르게 호출하게 된다.

즉,
State == ON 상태의 act() 와
State == OFF 상태의 act() 가
다르게 동작한다는 의미
 */
public enum State {
    ON {
        @Override
        public State act(Action action) {
            State result = ON;
            switch (action.getType()) {
                case CLICK_ON_SWITCH:
                    result = SLEEP;
                    break;
                case CLICK_OFF_SWITCH:
                    result = OFF;
                    break;
            }
            return result;
        }
    },
    OFF {
        @Override
        public State act(Action action) {
            State result = OFF;
            switch (action.getType()) {
                case CLICK_ON_SWITCH:
                    result = ON;
                    break;
            }
            return result;
        }
    },
    SLEEP {
        @Override
        public State act(Action action) {
            State result = SLEEP;
            switch (action.getType()) {
                case CLICK_ON_SWITCH:
                    result = ON;
                    break;
                case CLICK_OFF_SWITCH:
                    result = OFF;
                    break;
            }
            return result;
        }

        @Override
        public void notifyMode() {
            System.out.println("[NOTI] Sleeping Mode");
        }
    };

    abstract public State act(Action action);

    public void notifyMode() {}
}
