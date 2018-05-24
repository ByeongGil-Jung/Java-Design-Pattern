package concrete_class.win;

import abst_class.Button;
import abst_class.GuiFactory;
import abst_class.Table;

/**
 * Created by IntelliJ IDEA.
 * Project: Abstract-Factory-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-24
 * Time: 오전 9:27
 */
public class WindowGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Table createTable() {
        return new WindowTable();
    }
}
