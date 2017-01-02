package creational.factory.abstractfatory._new;

public class GUIFactoryTest {

	public static void main(String[] args) {
		IGUIFactory guiFactory = GUIFactoryProducer.getIGUIFactory(OSEnum.WINDOWS);
		IButton button = guiFactory.createButton();
		button.paint();
	}

}
