package creational.factory.abstractfactory;

import creational.factory.common.Color;
import creational.factory.common.CommonEnum;
import creational.factory.common.FactoryEnum;
import creational.factory.common.Shape;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryEnum.SHAPE);
		Shape shape = shapeFactory.getShape(CommonEnum.RECTANGLE);
		shape.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryEnum.COLOR);
		Color color = colorFactory.getColor(CommonEnum.BLUE);
		color.fill();
	}
}
