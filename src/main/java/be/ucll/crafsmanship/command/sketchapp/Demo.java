package be.ucll.crafsmanship.command.sketchapp;

import be.ucll.crafsmanship.command.sketchapp.commands.Command;
import be.ucll.crafsmanship.command.sketchapp.commands.DrawCircleConcreteCommand;
import be.ucll.crafsmanship.command.sketchapp.commands.DrawRectangleConcreteCommand;
import be.ucll.crafsmanship.command.sketchapp.commands.DrawSquareConcreteCommand;

public class Demo {
    public static void main(String[] args) {
        SketchApp sketchApp = new SketchApp();

        DrawShape drawShape = new DrawShape("Circle..");
        Command drawCircle = new DrawCircleConcreteCommand(drawShape);
        sketchApp.setCommand(drawCircle);
        sketchApp.drawTheShape();
        sketchApp.eraseTheShape(drawShape.shape);

        drawShape = new DrawShape("Square..");
        Command drawSquare = new DrawSquareConcreteCommand(drawShape);
        sketchApp.setCommand(drawSquare);
        sketchApp.drawTheShape();

        drawShape = new DrawShape("Rectangle..");
        Command drawRectangle = new DrawRectangleConcreteCommand(drawShape);
        sketchApp.setCommand(drawRectangle);
        sketchApp.drawTheShape();
        sketchApp.eraseTheShape(drawShape.shape);
    }
}
