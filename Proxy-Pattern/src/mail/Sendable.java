package mail;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-31
 * Time: 오후 6:15
 */
public interface Sendable {

    public void sendComplex(Mail mail);
    public void sendSimple(Mail mail);
}
