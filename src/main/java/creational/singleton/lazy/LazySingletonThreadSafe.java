package creational.singleton.lazy;

public final class LazySingletonThreadSafe {
	
	private static LazySingletonThreadSafe instance = null;
	
	private LazySingletonThreadSafe() {
	}
	
	//with synchronized key word
	public static synchronized LazySingletonThreadSafe getInstance_1(){
		if(instance == null){
			instance = new LazySingletonThreadSafe();
		}
		return instance;
	}
	
	//double check
	public static LazySingletonThreadSafe getInstance_2(){
		if(instance == null){
			synchronized(LazySingletonThreadSafe.class){
				if(instance == null){
					instance = new LazySingletonThreadSafe();
				}
			}
		}
		return instance;
	}
	
	//static inner class
	private static class LazyHolder{
		 private static final LazySingletonThreadSafe INSTANCE = new LazySingletonThreadSafe();
	}
	
	public static LazySingletonThreadSafe getInstance_3(){
		return LazyHolder.INSTANCE;
	}
}
