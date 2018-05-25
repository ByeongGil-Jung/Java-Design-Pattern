package interface_pkg;

/**
 * Created by IntelliJ IDEA.
 * Project: Bridge-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-24
 * Time: 오후 8:18
 */
public class DefaultMorseFunction implements MorseFunction {

    @Override
    public void dot() {
        System.out.print("·");
    }

    @Override
    public void dash() {
        System.out.print("-");
    }

    @Override
    public void space() {
        System.out.print(" ");
    }
}
