package behavioral.visitor.advanced;
public class Car implements ICarElement {
    ICarElement[] elements;

    public Car() {
        this.elements = new ICarElement[] { new Wheel("front left"),
            new Wheel("front right"), new Wheel("back left"),
            new Wheel("back right"), new Body(), new Engine() };
    }

    public void accept(final ICarElementVisitor visitor) {
        for(final ICarElement elem : elements) {
            elem.accept(visitor);
        }
        visitor.visit(this);
    }
}
