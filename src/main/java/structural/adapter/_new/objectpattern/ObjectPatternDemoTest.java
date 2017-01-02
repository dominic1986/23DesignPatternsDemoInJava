package structural.adapter._new.objectpattern;

public class ObjectPatternDemoTest {
	public static void main(String[] args) {
		Targetable targetable = new Adapter(new Adaptee());
		targetable.methodA();
		targetable.methodB();
	}
}
