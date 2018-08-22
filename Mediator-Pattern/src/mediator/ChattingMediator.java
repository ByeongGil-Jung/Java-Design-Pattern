package mediator;

import colleague.ChattingColleague;
import colleague.ChattingData;
import colleague.Colleague;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-23
 * Time: 오전 1:00
 */
public class ChattingMediator extends Mediator {

    @Override
    public void mediate(ChattingData data) {
        for (Colleague colleague : colleagues) {
            if (colleague instanceof ChattingColleague) {
                ChattingColleague chattingColleague = (ChattingColleague) colleague;
                data.setToRoom(chattingColleague.getRoom());
            }
            colleague.handle(data);
        }
    }
}
