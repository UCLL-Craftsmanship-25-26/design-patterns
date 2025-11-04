package be.ucll.crafsmanship.command.sketchapp.commands;

import be.ucll.crafsmanship.command.sketchapp.DrawShape;

public class DrawRectangleConcreteCommand implements Command {
    DrawShape draw;

    public DrawRectangleConcreteCommand(DrawShape draw) {
        this.draw = draw;
    }

    public void execute() {
        draw.drawRectangle();
    }

    public void undo(String shape) {
        draw.eraseShape(shape);
    }
}