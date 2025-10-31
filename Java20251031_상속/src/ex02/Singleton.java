package ex02;

class Singleton {
	
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton getInstance() { //정적메서드
		return singleton;
	}
}


class Sample {
	
	public Sample() {
	}
}