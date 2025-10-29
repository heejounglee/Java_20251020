package test;

public class Sample {

	public static void main(String[] args) {
		
		System.out.println("Hello, java");
		System.out.println("Hello, java");
		
		char var1 = 'A';
		char c1 = 65;
		
		char var2 = '가';
//		char c2 = 44032;
		char c2 = 0xD7A3;
		
		System.out.println(var1);
		System.out.println(c1);
		
		System.out.println(var2);
		System.out.println(c2);
		
		System.out.printf("%d\n",(int)c1);
		
		float f1 = 10.5f;
		
		double d1 = 10.5;
		
		System.out.println(f1);
		System.out.println(d1);
		
		double f2 = 2147483648L;
		float f3 = 2147483648f;
		float f4 = 2147483648f;
		
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		
		String str1 = "이\t희\t정";
		String str2 = "홍\n길\n동";
		
		System.out.println(str1);
		System.out.println(str2);
		
		int intA = 10000;
		byte byteB= 20;
		
		//intA = byteB;
		System.out.println("-------------강제 형변환------------");
		byteB = (byte)intA;
		
		System.out.println(intA);
		System.out.println(byteB);
		
		System.out.println("-------------실수 형변환------------");
		
		double dNum = 20.5;
		int iNum = 10;
		
		dNum = iNum;
		System.out.println("dNum : " + dNum);
		
		dNum = 20.5;
		iNum = (int)dNum;
		System.out.println("iNum : " +  iNum);
		
		System.out.println("-------------정수 나누기------------");
		int iNum2 = 5;
		int iNum3 = 2;
		
		dNum = iNum2 / iNum3;
		System.out.println("dNum : " + dNum);
		
		dNum = iNum2 / (double)iNum3;
		System.out.println("dNum : " + dNum);
		
		dNum =  (double)iNum2 / (double)iNum3;
		System.out.println("dNum : " + dNum);
		
		/*
		 * 
		 */
	}

}
