public class MacFactory extends GUIFactory {
    public AbstractPushButton createPushButton() {
        return new MacPushButton();
    }

    public AbstractTextField createTextField() {
        return new MacTextField();
    }

    public AbstractListBox createListBox() {
        return new MacListBox();
    }
}