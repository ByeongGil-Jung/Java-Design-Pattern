package concrete_class.linux;

import abst_class.Button;
import abst_class.GuiFactory;
import abst_class.Table;

/**
 * Created by IntelliJ IDEA.
 * Project: Abstract-Factory-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-24
 * Time: 오전 9:26
 */
public class LinuxGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Table createTable() {
        return new LinuxTable();
    }
}
