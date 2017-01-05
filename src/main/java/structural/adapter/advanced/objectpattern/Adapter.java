package structural.adapter.advanced.objectpattern;

public class Adapter implements Targetable {
	private final Adaptee adaptee;
	
	public Adapter(final Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void methodA() {
		adaptee.methodA();
	}

	@Override
	public void methodB() {
		System.out.println("MethodB from adaptor!!!");
	}

}
