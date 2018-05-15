package factory;

import product.Cake;
import product.ChocolateCake;
import product.StrawberryCake;

/**
 * Created by IntelliJ IDEA.
 * Project: Factory-Method-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-15
 * Time: 오전 9:41
 */
public class CakeFactory {

    public Cake createCake(String name) {

        Cake cake = null;

        if (name.equals("Chocolate")) {
            cake = new ChocolateCake();
        } else if (name.equals("Strawberry")) {
            cake = new StrawberryCake();
        }

        return cake;
    }
}
