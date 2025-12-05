package be.ucll.crafsmanship.factories.abstractfactory;


import be.ucll.crafsmanship.factories.factory.Button;

// The Abstract Factory
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox(); // New method for the new product
}

