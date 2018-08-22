package colleague;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-23
 * Time: 오전 1:09
 */
public class ChattingColleague extends Colleague {

    private String name;
    private String room;

    public ChattingColleague(String name, String room) {
        this.name = name;
        this.room = room;
    }

    public void sendChattingMessage(String context) {
        mediator.mediate(new ChattingData(name, context, room));
    }

    public String getRoom() {
        return room;
    }

    @Override
    public void handle(ChattingData data) {
        System.out.println(String.format("Name : %s", data.getName()));
        System.out.println(String.format("Context : %s", data.getContext()));
        System.out.println(String.format("From_Room : %s", data.getFromRoom()));
        System.out.println(String.format("To_Room : %s", data.getToRoom()));
    }
}
