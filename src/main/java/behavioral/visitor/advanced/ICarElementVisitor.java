package behavioral.visitor.advanced;
public interface ICarElementVisitor {
	public void visit(final Body body);
	public void visit(final Car car);
	public void visit(final Engine engine);
	public void visit(final Wheel wheel);
}