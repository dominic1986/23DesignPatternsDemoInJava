package behavioral.visitor.advanced;
public class Body implements ICarElement {
    public void accept(final ICarElementVisitor visitor) {
        visitor.visit(this);
    }
}