package behavioral.visitor.advanced;
public class Engine implements ICarElement {
    public void accept(final ICarElementVisitor visitor) {
        visitor.visit(this);
    }
}