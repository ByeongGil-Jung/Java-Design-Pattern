package commands;

import shapes.IShape;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-09-01
 * Time: 오후 2:02
 */
public interface ICommand {

    public void execute();
    public void undo();
    public void redo();
}
