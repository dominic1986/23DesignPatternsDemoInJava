package creational.factory.abstractfactory;

import creational.factory.common.Color;
import creational.factory.common.CommonEnum;
import creational.factory.common.Shape;

public interface AbstractFactory {
	Shape getShape(CommonEnum commonEnum);
	Color getColor(CommonEnum commonEnum);
}
