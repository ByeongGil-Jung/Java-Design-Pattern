package concrete_class.mac;

import abst_class.Button;

/**
 * Created by IntelliJ IDEA.
 * Project: Abstract-Factory-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-24
 * Time: 오전 9:21
 */
public class MacButton implements Button {

    @Override
    public void click() {
        System.out.println("Mac :: Button Click");
    }
}
