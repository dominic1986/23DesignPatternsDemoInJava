package creational.factory.factory;

import creational.factory.common.Shape;
import creational.factory.common.CommonEnum;

public class FactoryTest {

	public static void main(String[] args) {
		Shape shape = ShapeFactory.getShape(CommonEnum.RECTANGLE);
		shape.draw();
	}

}
