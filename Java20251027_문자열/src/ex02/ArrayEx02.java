package ex02;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] numArr = {90,80,70,60,50};
		
		int sum=0;
		for(int i=0; i<5; i++) {
			sum += numArr[i];
		}
		System.out.println("총합 : "+sum);
	}

}
