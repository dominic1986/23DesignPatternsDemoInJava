package structural.adapter._new.classpattern;

public class ClassPatternDemoTest {
	public static void main(String[] args) {
		Adapter adaptor1 = new Adapter1();
		adaptor1.method1();
		Adapter adaptor2 = new Adapter2();
		adaptor2.method2();
	}
}
