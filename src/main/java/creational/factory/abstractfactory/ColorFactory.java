package creational.factory.abstractfactory;

import creational.factory.common.Blue;
import creational.factory.common.Color;
import creational.factory.common.CommonEnum;
import creational.factory.common.Red;
import creational.factory.common.Shape;
import creational.factory.common.Yellow;

public class ColorFactory implements AbstractFactory {
	public Shape getShape(CommonEnum commonEnum) {
		throw new UnsupportedOperationException();
	}

	public Color getColor(CommonEnum commonEnum) {
		switch (commonEnum) {
		case RED:
			return new Red();
		case BLUE:
			return new Blue();			
		case YELLOW:
			return new Yellow();						
		default:
			break;
		}
		return null;
	}
}
