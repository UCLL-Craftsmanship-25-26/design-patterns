package be.ucll.crafsmanship.factories.abstractfactory;

import be.ucll.crafsmanship.factories.factory.Button;
import be.ucll.crafsmanship.factories.factory.WindowsButton;

// Concrete Factories (The family implementers)
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}