package singleton;

/**
 * Created by IntelliJ IDEA.
 * Project: Singleton-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-16
 * Time: 오후 8:13
 */
public class DataConnector {

    private static DataConnector instance;
    private String a;

    private DataConnector() {}

    public static DataConnector getInstance() {

        if (instance == null)
            instance = new DataConnector();

        return instance;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
