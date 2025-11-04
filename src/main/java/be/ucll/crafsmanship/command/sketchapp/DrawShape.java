package be.ucll.crafsmanship.command.sketchapp;

public class DrawShape {
    String shape;

    public DrawShape(String shape) {
        this.shape = shape;
    }

    public void drawCircle() {
        System.out.println("Drawing Circle..");
    }

    public void drawSquare() {
        System.out.println("Drawing Square..");
    }

    public void drawRectangle() {
        System.out.println("Drawing Rectangle..");
    }

    public void eraseShape(String shape) {
        System.out.println("Erasing " + shape);
    }
}




