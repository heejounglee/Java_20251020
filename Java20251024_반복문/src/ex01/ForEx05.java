package ex01;

public class ForEx05 {

	public static void main(String[] args) {
		
		
		for(int i=2; i<=5; i++) {
			System.out.println("---------" + i + "단" + "---------");
			for (int j=1; j<=9; j++)
			 System.out.println(i + " X " + j + " = " + i*j);
		}

	}

}