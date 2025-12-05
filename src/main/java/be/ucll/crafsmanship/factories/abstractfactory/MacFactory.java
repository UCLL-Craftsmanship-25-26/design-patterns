package be.ucll.crafsmanship.factories.abstractfactory;

import be.ucll.crafsmanship.factories.factory.Button;
import be.ucll.crafsmanship.factories.factory.MacButton;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
