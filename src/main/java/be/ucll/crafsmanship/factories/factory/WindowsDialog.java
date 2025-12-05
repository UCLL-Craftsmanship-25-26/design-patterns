package be.ucll.crafsmanship.factories.factory;


// Concrete Creators
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
