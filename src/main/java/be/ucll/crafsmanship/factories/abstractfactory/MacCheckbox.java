package be.ucll.crafsmanship.factories.abstractfactory;

public class MacCheckbox implements Checkbox {
    @Override
    public void toggle() {
        System.out.println("Rendering a Mac-style Checkbox.");
    }
}
