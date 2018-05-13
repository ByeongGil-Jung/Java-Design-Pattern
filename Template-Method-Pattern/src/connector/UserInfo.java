package connector;

/**
 * Created by IntelliJ IDEA.
 * Project: Template-Method-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-13
 * Time: 오전 10:10
 */
public class UserInfo {

    private String id;
    private String pw;
    private String userName;
    private String extraInfo;

    public UserInfo() {}

    public UserInfo(String id, String pw, String userName, String extraInfo) {
        this.id = id;
        this.pw = pw;
        this.userName = userName;
        this.extraInfo = extraInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }
}
