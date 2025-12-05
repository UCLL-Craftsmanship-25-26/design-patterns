package be.ucll.crafsmanship.factories.factory;

// Abstract Creator
public abstract class Dialog {
    // The Factory Method
    public abstract Button createButton();

    // The business logic method that uses the product
    public void render() {
        Button button = createButton(); // Polymorphic call to the factory method
        System.out.print("Dialog is rendering. Result: ");
        button.paint();
    }
}