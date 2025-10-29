package ex02;

public class ArrayEx01 {

	public static void main(String[] args) {
		int[] numArr = new int[5];
		
		numArr[0] = 90;
		numArr[1] = 80;
		numArr[2] = 70;
		numArr[3] = 60;
		numArr[4] = 50;
		
		int sum=0;
		for(int i=0; i<5; i++) {
			sum += numArr[i];
		}
		System.out.println("총합 : "+sum);
	}

}
