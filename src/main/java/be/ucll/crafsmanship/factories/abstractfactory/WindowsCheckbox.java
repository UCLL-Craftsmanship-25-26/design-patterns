package be.ucll.crafsmanship.factories.abstractfactory;

// Concrete Checkbox Products (The family members)
public class WindowsCheckbox implements Checkbox {
    @Override
    public void toggle() {
        System.out.println("Rendering a Windows-style Checkbox.");
    }
}
