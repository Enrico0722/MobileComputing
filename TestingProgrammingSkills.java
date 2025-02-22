public class TestingProgrammingSkills{

	public static void main(String[] args) {
		int rows = 5;

		System.out.println("Triangle");
		printTriangle(rows);

		System.out.println("\nReversed Triangle");
		printReversedTriangle(rows);

		System.out.println("\nDiamond");
		printDiamond(rows);
	}

	public static void printTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printReversedTriangle(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printDiamond(int n) {
		printTriangle(n);
		printReversedTriangle(n - 1);
	}
}
