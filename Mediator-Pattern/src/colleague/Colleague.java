package colleague;

import mediator.Mediator;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-22
 * Time: 오후 11:03
 */
public abstract class Colleague {

    protected Mediator mediator;

    public boolean registerMediator(Mediator mediator) {
        this.mediator = mediator;
        return this.mediator.addColleague(this);
    }

    abstract public void handle(ChattingData data);
}
