package be.ucll.crafsmanship.command.sketchapp;

import be.ucll.crafsmanship.command.sketchapp.commands.Command;

public class SketchApp{   //Invoker class
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void drawTheShape() {
        command.execute();
    }

    public void eraseTheShape(String shape) {
        command.undo(shape);
    }
}




