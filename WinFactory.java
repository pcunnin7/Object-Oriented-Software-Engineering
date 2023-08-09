public class WinFactory extends GUIFactory {
    public AbstractPushButton createPushButton() {
        return new WinPushButton();
    }

    public AbstractTextField createTextField() {
        return new WinTextField();
    }

    public AbstractListBox createListBox() {
        return new WinListBox();
    }
}