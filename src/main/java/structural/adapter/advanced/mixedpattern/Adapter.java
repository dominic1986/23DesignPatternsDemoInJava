package structural.adapter.advanced.mixedpattern;

public class Adapter extends Adaptee implements Targetable {
	@Override
	public void methodA() {
		super.methodA();
	}

	@Override
	public void methodB() {
		System.out.println("MethodB from adaptor!!!");
	}
}
