package creational.factory.abstractfatory.advanced;

public abstract class GUIFactoryProducer {
	public static IGUIFactory getIGUIFactory(OSEnum osEnum){
		switch (osEnum) {
		case WINDOWS:
			return new WinFactory();
		case OSX:
			return new OSXFactory();			
		default:
			break;
		}
		return null;
	}
}
