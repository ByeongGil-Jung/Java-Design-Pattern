package connector;

/**
 * Created by IntelliJ IDEA.
 * Project: Template-Method-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-13
 * Time: 오전 9:21
 */
public abstract class AbstConnector {

    protected abstract String doSecurity(String str);

    protected abstract boolean authentication(String id, String pw);

    protected abstract int authorization(String userName);

    protected abstract boolean connection(UserInfo info);

    // Template Method
    public boolean requestConnection(String encodedInfo) {

        String id, pw, userName;
        UserInfo userInfo = new UserInfo();

        /*
        - 1. Security Task
        :: Encoded Info -> Decoded Info
         */
        String decodedInfo = doSecurity(encodedInfo);

        // Insert test info (== decodedInfo)
        userInfo.setId(decodedInfo);
        userInfo.setPw("123");
        userInfo.setUserName("userName");
        userInfo.setExtraInfo("extraInfo");

        id = userInfo.getId();
        pw = userInfo.getPw();

        /*
        - 2. Authentication Task
        :: return authentication (boolean)
         */
        if (!authentication(id, pw))
            throw new Error("ID and Password are NOT matched");

        userName = userInfo.getUserName();

        /*
        - 3. Authorization Task
        :: return authorization information
        (1: admin // 2: manager // 3. employee)
         */
        int check = authorization(userName);

        switch (check) {
            case 1: // admin
                System.out.println("Account : admin");
                break;
            case 2:
                System.out.println("Account : manager");
                break;
            case 3:
                System.out.println("Account : employee");
                break;
            default:
                System.out.println("Account : -");
                break;
        }

        /*
        - 4. Connection Task
        :: return True if connect succeeded
         */
        return connection(userInfo);
    }
}
