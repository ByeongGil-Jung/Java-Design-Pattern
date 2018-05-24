package concrete_class.win;

import abst_class.Table;

/**
 * Created by IntelliJ IDEA.
 * Project: Abstract-Factory-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-24
 * Time: 오전 9:25
 */
public class WindowTable implements Table {

    @Override
    public String getTable() {
        return "Window :: Table View";
    }
}
