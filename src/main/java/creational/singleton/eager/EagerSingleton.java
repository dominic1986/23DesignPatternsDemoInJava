package creational.singleton.eager;

public final class EagerSingleton {
	
	private final static EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton(){
	}
	
	public static EagerSingleton getInstance(){
		return instance;
	}
}
