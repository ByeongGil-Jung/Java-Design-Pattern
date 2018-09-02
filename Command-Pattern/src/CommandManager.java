import commands.ICommand;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-09-01
 * Time: 오후 2:05
 */
public class CommandManager {

    private Stack<ICommand> undos;
    private Stack<ICommand> redos;

    public CommandManager() {
        this.undos = new Stack<>();
        this.redos = new Stack<>();
    }

    public void execute(ICommand command) {
        undos.push(command);
        command.execute();
    }

    public void undo() {
        if (!undos.empty()) {
            ICommand command = undos.pop();
            redos.push(command);
            command.undo();
        } else {
            System.out.println("There is no \"Undo Command\"");
        }
    }

    public void redo() {
        if (!redos.empty()) {
            ICommand command = redos.pop();
            undos.push(command);
            command.redo();
        } else {
            System.out.println("There is no \"Redo Command\"");
        }
    }

    public void resetRedo() {
        redos.removeAllElements();
    }

    public String toStringUndos() {
        return undos.toString();
    }

    public String toStringRedos() {
        return redos.toString();
    }
}
