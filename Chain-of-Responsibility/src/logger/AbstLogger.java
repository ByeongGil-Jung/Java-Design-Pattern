package logger;

/**
 * Created by IntelliJ IDEA.
 * Project: Chain-of-Responsibility
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-07-03
 * Time: 오후 8:11
 */
public abstract class AbstLogger {

    protected int level;
    protected AbstLogger nextLogger;

    public void setNextLogger(AbstLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level)
            write(message);
        if (nextLogger != null)
            nextLogger.logMessage(level, message);
    }

    abstract protected void write(String message);
}
