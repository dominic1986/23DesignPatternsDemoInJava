package creational.factory.factory;

import creational.factory.common.Circle;
import creational.factory.common.Rectangle;
import creational.factory.common.Shape;
import creational.factory.common.CommonEnum;
import creational.factory.common.Square;

public abstract class ShapeFactory {
	public static Shape getShape(CommonEnum shapeEnum){
		switch (shapeEnum) {
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
}