package be.ucll.crafsmanship.factories.factory;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Mac-style Button.");
    }
}
