package concrete_class.linux;

import abst_class.Button;

/**
 * Created by IntelliJ IDEA.
 * Project: Abstract-Factory-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-24
 * Time: 오전 9:20
 */
public class LinuxButton implements Button {

    @Override
    public void click() {
        System.out.println("Linux :: Button Click");
    }
}
