package creational.singleton.lazy;

public final class LazySingletonNoneThreadSafe {
	
	private static LazySingletonNoneThreadSafe instance = null;
	
	private LazySingletonNoneThreadSafe() {
	}
	
	public static LazySingletonNoneThreadSafe getInstance(){
		if(instance == null){
			instance = new LazySingletonNoneThreadSafe();
		}
		return instance;
	}
}
