package concrete_class.linux;

import abst_class.Table;

/**
 * Created by IntelliJ IDEA.
 * Project: Abstract-Factory-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-24
 * Time: 오전 9:25
 */
public class LinuxTable implements Table {

    @Override
    public String getTable() {
        return "Linux :: Table View";
    }
}
