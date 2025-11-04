package be.ucll.crafsmanship.command.sketchapp.commands;

public interface Command {
    void execute();
    void undo(String shape);
}



