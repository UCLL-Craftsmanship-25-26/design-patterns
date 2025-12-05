package be.ucll.crafsmanship.factories.factory;


// Concrete Products
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows-style Button.");
    }
}
