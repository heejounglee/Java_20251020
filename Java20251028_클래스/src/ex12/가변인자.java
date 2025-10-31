package ex12;

public class 가변인자 {

	public static void main(String[] args) {
		String[] strArr = {"100","200","300"};
		
		System.out.println(concatenate(",","100","200","300"));
		System.out.println(concatenate2(",",10,20,30));
	}
	
	static String concatenate(String delim,  String...args) {
		//System.out.println(delim + " | " + str + " | " + args);
		
		for(String s : args)
			System.out.println(s);
		
		return null;
	}

	static String concatenate2(String delim,  int...args) {
		//System.out.println(delim + " | " + str + " | " + args);
		
		for(int s : args)
			System.out.println(s);
		
		return null;
	}
	
}
