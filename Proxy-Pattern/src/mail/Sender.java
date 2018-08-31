package mail;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-31
 * Time: 오후 7:13
 */
// Original 객체
public class Sender implements Sendable {

    @Override
    public void sendComplex(Mail mail) {
        System.out.println(" == Original Sender ==");
        System.out.println(String.format("From : %s", mail.getFromName()));
        System.out.println(String.format("To : %s", mail.getToName()));
        System.out.println(String.format("Context : %s", mail.getContext()));
    }

    @Override
    public void sendSimple(Mail mail) {
        System.out.println("\n == Original Sender ==");
        System.out.println(String.format("From : %s", mail.getFromName()));
        System.out.println(String.format("To : %s", mail.getToName()));
        System.out.println(String.format("Context : %s", mail.getContext()));
    }
}
