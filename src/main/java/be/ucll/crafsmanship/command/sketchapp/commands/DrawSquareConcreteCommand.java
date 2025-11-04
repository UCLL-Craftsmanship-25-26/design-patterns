package be.ucll.crafsmanship.command.sketchapp.commands;

import be.ucll.crafsmanship.command.sketchapp.DrawShape;

public class DrawSquareConcreteCommand implements Command {
    DrawShape draw;

    public DrawSquareConcreteCommand(DrawShape draw) {
        this.draw = draw;
    }

    public void execute() {
        draw.drawSquare();
    }

    public void undo(String shape) {
        draw.eraseShape(shape);
    }
}