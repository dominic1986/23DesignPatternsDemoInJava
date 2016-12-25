package creational.factory.abstractFactory;

import creational.factory.common.FactoryEnum;

public abstract class FactoryProducer {
	public static AbstractFactory getFactory(FactoryEnum factoryEnum){
		switch (factoryEnum) {
		case SHAPE:
			return new ShapeFactory();
		case COLOR:
			return new ColorFactory();
		default:
			break;
		}
		return null;
	}
}
