package mediator;

import colleague.ChattingData;
import colleague.Colleague;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-22
 * Time: 오후 11:05
 */
public abstract class Mediator {

    protected List<Colleague> colleagues;

    public Mediator() {
        this.colleagues = new ArrayList<>();
    }

    public boolean addColleague(Colleague colleague) {
        return colleagues.add(colleague);
    }

    public boolean deleteColleague(Colleague colleague) {
        return colleagues.remove(colleague);
    }

    abstract public void mediate(ChattingData data);
}
