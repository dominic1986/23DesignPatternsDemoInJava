package creational.factory.abstractFactory;

import creational.factory.common.Circle;
import creational.factory.common.Color;
import creational.factory.common.CommonEnum;
import creational.factory.common.Rectangle;
import creational.factory.common.Shape;
import creational.factory.common.Square;

public class ShapeFactory implements AbstractFactory {
	public Shape getShape(CommonEnum commonEnum) {
		switch (commonEnum) {
		case CIRCLE:
			return new Circle();
		case RECTANGLE:
			return new Rectangle();			
		case SQUARE:
			return new Square();						
		default:
			break;
		}
		return null;
	}

	public Color getColor(CommonEnum commonEnum) {
		throw new UnsupportedOperationException();
	}
}
