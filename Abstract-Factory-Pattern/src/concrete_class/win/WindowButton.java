package concrete_class.win;

import abst_class.Button;

/**
 * Created by IntelliJ IDEA.
 * Project: Abstract-Factory-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-24
 * Time: 오전 9:20
 */
public class WindowButton implements Button {

    @Override
    public void click() {
        System.out.println("Window :: Button Click");
    }
}
