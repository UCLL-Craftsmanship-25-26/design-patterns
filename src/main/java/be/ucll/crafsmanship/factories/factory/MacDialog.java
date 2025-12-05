package be.ucll.crafsmanship.factories.factory;

public class MacDialog extends Dialog {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
