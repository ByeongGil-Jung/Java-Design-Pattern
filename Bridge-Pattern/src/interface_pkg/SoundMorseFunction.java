package interface_pkg;

/**
 * Created by IntelliJ IDEA.
 * Project: Bridge-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-24
 * Time: 오후 8:21
 */
public class SoundMorseFunction implements MorseFunction {

    @Override
    public void dot() {
        System.out.print("Bip!");
    }

    @Override
    public void dash() {
        System.out.print("Bee-");
    }

    @Override
    public void space() {
        System.out.print(" ");
    }
}
