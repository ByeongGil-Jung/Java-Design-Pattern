package duck;

/**
 * Created by IntelliJ IDEA.
 * Project: Adapter-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-11
 * Time: 오전 1:00
 */
public class GoodDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack Quack !");
    }

    @Override
    public void fly() {
        System.out.println("I can fly ~");
    }
}
