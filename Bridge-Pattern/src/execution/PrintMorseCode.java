package execution;

import interface_pkg.MorseFunction;

/**
 * Created by IntelliJ IDEA.
 * Project: Bridge-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-24
 * Time: 오후 8:49
 */
public class PrintMorseCode extends MorseCode {

    public PrintMorseCode() {
        super();
    }

    public PrintMorseCode(MorseFunction morseFunction) {
        super(morseFunction);
    }

    public PrintMorseCode J() {
        dot();
        dash();
        dash();
        dash();
        space();
        return this;
    }

    public PrintMorseCode B() {
        dash();
        dot();
        dot();
        dot();
        space();
        return this;
    }

    public PrintMorseCode K() {
        dash();
        dot();
        dash();
        space();
        return this;
    }
}
