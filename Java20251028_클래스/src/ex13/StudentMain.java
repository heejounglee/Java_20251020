package ex13;

public class StudentMain {

	public static void main(String[] args) {
		Student st = new Student("hong",1,1,100,60,76);
		int   sum = st.getTotal();
		System.out.println(sum);
		float avg = st.getAverage();
		System.out.println(avg);
		System.out.printf("%.2f\n", st.getAverage2());
		
		st.info();
	}

}
