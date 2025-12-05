package be.ucll.crafsmanship.factories.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        System.out.println("\n--- Phase 2: Abstract Factory (Families of Products) ---");

        // Use the Windows family
        GUIFactory winFactory = new WindowsFactory();
        Application winApp = new Application(winFactory);
        winApp.runUI();

        System.out.println("----------------------------------------");

        // Easily switch to the Mac family
        GUIFactory macFactory = new MacFactory();
        Application macApp = new Application(macFactory);
        macApp.runUI();
    }
}