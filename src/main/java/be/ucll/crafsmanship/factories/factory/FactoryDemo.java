package be.ucll.crafsmanship.factories.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        System.out.println("--- Factory Method (Buttons Only) ---");
        Dialog winDialog = new WindowsDialog();
        winDialog.render();

        Dialog macDialog = new MacDialog();
        macDialog.render();
    }
}