package be.ucll.crafsmanship.factories.abstractfactory;

import be.ucll.crafsmanship.factories.factory.Button;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    // The client takes the Abstract Factory as a parameter (composition)
    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void runUI() {
        System.out.print("Application running with components: ");
        button.paint();
        System.out.print("and also: ");
        checkbox.toggle();
    }
}
