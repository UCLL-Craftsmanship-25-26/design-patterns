package be.ucll.crafsmanship.command.sketchapp.commands;

import be.ucll.crafsmanship.command.sketchapp.DrawShape;

public class DrawCircleConcreteCommand implements Command {
    DrawShape draw;

    public DrawCircleConcreteCommand(DrawShape draw) {
        this.draw = draw;
    }

    public void execute() {
        draw.drawCircle();
    }

    public void undo(String shape) {
        draw.eraseShape(shape);

    }
}




