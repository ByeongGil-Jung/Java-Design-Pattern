package execution;

import interface_pkg.DefaultMorseFunction;
import interface_pkg.MorseFunction;

/**
 * Created by IntelliJ IDEA.
 * Project: Bridge-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-24
 * Time: 오후 8:26
 */
public class MorseCode {

    private MorseFunction morseFunction;

    public MorseCode() {
        this.morseFunction = new DefaultMorseFunction();
    }

    public MorseCode(MorseFunction morseFunction) {
        this.morseFunction = morseFunction;
    }

    public void dot() {
        morseFunction.dot();
    }

    public void dash() {
        morseFunction.dash();
    }

    public void space() {
        morseFunction.space();
    }
}
