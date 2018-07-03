package logger;

/**
 * Created by IntelliJ IDEA.
 * Project: Chain-of-Responsibility
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-07-03
 * Time: 오후 8:59
 */
public class WarningLogger extends AbstLogger {

    public WarningLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("[WARNING] :: " + message);
    }
}
