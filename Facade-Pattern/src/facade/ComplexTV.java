package facade;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-20
 * Time: 오후 4:37
 */
class ComplexTV {

    private boolean _switch;

    public ComplexTV() {
        this._switch = false;
    }

    public boolean isSwitch() {
        return _switch;
    }

    public void switchOn() {
        System.out.println("ComplexTV :: Switch On");
        _switch = true;
    }

    public void switchOff() {
        System.out.println("ComplexTV :: Switch Off");
        _switch = false;
    }
}
