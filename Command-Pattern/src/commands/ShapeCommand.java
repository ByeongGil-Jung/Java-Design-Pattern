package commands;

import shapes.IShape;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-09-01
 * Time: 오후 2:09
 */
public class ShapeCommand implements ICommand {

    private IShape shape;

    public ShapeCommand(IShape shape) {
        this.shape = shape;
    }

    @Override
    public void execute() {
        shape.draw();
    }

    @Override
    public void undo() {
        shape.undraw();
    }

    @Override
    public void redo() {
        execute();
    }

    @Override
    public String toString() {
        return shape.toString();
    }
}
