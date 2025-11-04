package be.ucll.crafsmanship.command.gamecontroller;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command crossCommand = new CrossButtonCommand(receiver);
//        Command triangleCommand = new TriangleButtonCommand(receiver);
//        Command squareCommand = new SquareButtonCommand(receiver);
//        Command circleCommand = new CircleButtonCommand(receiver);
//
//        PS5Controller controller = new PS5Controller();
//        controller.setCrossButton(crossCommand);
//        controller.setTriangleButton(triangleCommand);
//        controller.setSquareButton(squareCommand);
//        controller.setCircleButton(circleCommand);
//
//        // Simulate button presses
//        controller.pressCross();
//        controller.pressTriangle();
//        controller.pressSquare();
//        controller.pressCircle();
    }
}
