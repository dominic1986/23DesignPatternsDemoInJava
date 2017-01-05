package structural.adapter.advanced.objectpattern;

public class ObjectPatternDemoTest {
	public static void main(String[] args) {
		Targetable targetable = new Adapter(new Adaptee());
		targetable.methodA();
		targetable.methodB();
	}
}
