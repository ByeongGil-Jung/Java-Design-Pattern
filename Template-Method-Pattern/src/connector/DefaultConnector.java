package connector;

/**
 * Created by IntelliJ IDEA.
 * Project: Template-Method-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-13
 * Time: 오전 10:32
 */
public class DefaultConnector extends AbstConnector {

    // Security task ...
    @Override
    protected String doSecurity(String str) {
        System.out.println("Decoding processing ...");
        return str;
    }

    // Authentication task ...
    @Override
    protected boolean authentication(String id, String pw) {
        String c_id = "abc";
        String c_pw = "123";
        boolean check;

        check = id.equals(c_id) && pw.equals(c_pw);

        System.out.println("Authentication processing ...");
        return check;
    }

    // Authorization task ...
    @Override
    protected int authorization(String userName) {

        int check = 0; // default

        if (userName.equals("userName"))
            check = 3;

        System.out.println("Authorization processing ...");
        return check;
    }

    // Connection task ...
    @Override
    protected boolean connection(UserInfo info) {
        System.out.println("Connection processing ...");
        System.out.println("================");
        System.out.println("id : " + info.getId());
        System.out.println("pw : " + info.getPw());
        System.out.println("userName : " + info.getUserName());
        System.out.println("extraInfo : " + info.getExtraInfo());

        return true;
    }
}
