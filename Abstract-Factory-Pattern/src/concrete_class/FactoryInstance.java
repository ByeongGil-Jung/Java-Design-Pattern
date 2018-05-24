package concrete_class;

import abst_class.GuiFactory;
import concrete_class.linux.LinuxGuiFactory;
import concrete_class.mac.MacGuiFactory;
import concrete_class.win.WindowGuiFactory;

/**
 * Created by IntelliJ IDEA.
 * Project: Abstract-Factory-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-24
 * Time: 오전 9:52
 */
public class FactoryInstance {

    private static FactoryInstance instance = null;

    private FactoryInstance() {}

    public static FactoryInstance getInstance() {
        if (instance == null)
            instance = new FactoryInstance();
        return instance;
    }

    public GuiFactory getGuiFactory() {

        GuiFactory guiFactory = null;
        String platformType = System.getProperty("os.name");

        switch (platformType) {
            case "Linux":
                guiFactory = new LinuxGuiFactory();
                break;
            case "Windows 10":
                guiFactory = new WindowGuiFactory();
                break;
            case "Mac OS X":
                guiFactory = new MacGuiFactory();
                break;
        }

        return guiFactory;
    }
}
