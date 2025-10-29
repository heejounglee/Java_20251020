package ex01;

public class ForEx03 {

	public static void main(String[] args) {
		
		int sum=0;
		int i=1 ;
		
		for( ; i<=100; ) {
			if (i%2 == 0) {
				//System.out.println("i : " + i);
				sum += i++;
			} else  i++;
			
			//i++;
		}

		System.out.println("합 : " + sum);
	}

}