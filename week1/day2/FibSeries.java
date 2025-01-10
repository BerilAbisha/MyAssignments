package week1.day2;

public class FibSeries {

	public static void main(String[] args) {
		
		int a = 0, b = 1;
		for (int i = 0; i < 7; i++) {
			System.out.println(a);
		
			int c = b + a;
				a = b;
				b = c;
		}
	}
	}


