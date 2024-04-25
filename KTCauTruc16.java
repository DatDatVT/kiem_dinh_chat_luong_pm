import java.util.Scanner;

public class KTCauTruc16 {
	public static void main(String[] args) {
// Test case 1: m > n
		int m1 = 36;
		int n1 = 24;
		testEuclideanAlgorithm(m1, n1);
// Test case 2: m < n
		int m2 = 24;
		int n2 = 36;
		testEuclideanAlgorithm(m2, n2);

// Test case 3: m = n
		int m3 = 60;
		int n3 = 60;
		testEuclideanAlgorithm(m3, n3);
	}

	private static void testEuclideanAlgorithm(int m, int n) {
		System.out.println("Testing with m = " + m + ", n = " + n);
		int r;

		if (n > m) {
			r = m;
			m = n;
			n = r;
		}

		r = m % n;
		while (r != 0) {
			m = n;
			n = r;
			r = m % n;
		}

		int expectedResult = n;
		System.out.println("Expected result: " + expectedResult);

// Get user input for the actual result
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the actual result: ");
		int actualResult = scanner.nextInt();

		if (actualResult == expectedResult) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!");
		}
		System.out.println();
	}
}