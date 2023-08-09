public class LinuxFactory extends GUIFactory {
    public AbstractPushButton createPushButton() {
        return new LinuxPushButton();
    }

    public AbstractTextField createTextField() {
        return new LinuxTextField();
    }

    public AbstractListBox createListBox() {
        return new LinuxListBox();
    }
}