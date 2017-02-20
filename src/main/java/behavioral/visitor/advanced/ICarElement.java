package behavioral.visitor.advanced;
public interface ICarElement {
	public void accept(final ICarElementVisitor visitor);
}