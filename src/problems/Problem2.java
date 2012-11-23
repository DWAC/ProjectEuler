package problems;

public class Problem2 {

	private static int total = 0;

	public static void fibCalc(int a, int b) {
		if (b % 2 == 0) {
			total = total + b;
		}
		if (b > 4000000) {
			return;
		}
		fibCalc(b, a + b);
	}

	public static void main(String[] args) {

		fibCalc(1, 2);
		System.out.println(total);

	}

}
