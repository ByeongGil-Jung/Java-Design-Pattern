package breadmachine;

/**
 * Created by IntelliJ IDEA.
 * Project: Prototype-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-19
 * Time: 오전 10:07
 */
public class BreadMachine implements Cloneable {

    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
