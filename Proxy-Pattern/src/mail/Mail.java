package mail;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-31
 * Time: 오후 7:11
 */
public class Mail {

    private String fromName;
    private String toName;
    private String context;

    public Mail(String fromName, String toName) {
        this.fromName = fromName;
        this.toName = toName;
    }

    public String getFromName() {
        return fromName;
    }

    public String getToName() {
        return toName;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
