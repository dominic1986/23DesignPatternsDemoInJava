package behavioral.visitor.advanced;
public class VisitorDemo {
    public static void main(final String[] arguments) {
        final ICarElement car = new Car();
		
        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }
}