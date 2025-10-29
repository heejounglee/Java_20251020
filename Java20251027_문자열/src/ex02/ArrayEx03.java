package ex02;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[] numArr = {90,80,70,60,50};
		
		int sum=0;
		System.out.println(numArr.length);
		for(int i=0; i<numArr.length; i++) {
			sum += numArr[i];
		}
		System.out.println("총합 : "+sum);
	}

}
