package colleague;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-23
 * Time: 오전 1:06
 */
public class ChattingData {

    private String name;
    private String context;
    private String fromRoom;
    private String toRoom;

    public ChattingData(String name, String context, String fromRoom) {
        this.name = name;
        this.context = context;
        this.fromRoom = fromRoom;
    }

    public String getName() {
        return name;
    }

    public String getContext() {
        return context;
    }

    public String getFromRoom() {
        return fromRoom;
    }

    public String getToRoom() {
        return toRoom;
    }

    public void setToRoom(String toRoom) {
        this.toRoom = toRoom;
    }
}
