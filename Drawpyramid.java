package ctdl;

public class Drawpyramid {
	public static void drawpyramid(int n) {
		invertedPyramidPattern7(n, 1);
	}

	public static void pyramidPattern(int n, int k) {
		for (int i = 0; i < n - k; i++) {
			System.out.print(" ");
		}
		for (int i = 0; i < 2 * k - 1; i++) {
			System.out.print("X");
		}
		System.out.println();
		if (n > k) {
			pyramidPattern(n, k + 1);
		}
	}

	public static void pyramidPattern1(int n, int k) {
		for (int i = 0; i < n - k; i++) {
			System.out.print(" ");
		}
		for (int i = 0; i < 2 * k - 1; i++) {
			System.out.print(k);
		}
		System.out.println();
		if (n > k) {
			pyramidPattern1(n, k + 1);
		}

	}

	public static void pyramidPattern2(int n, int k) {
		for (int i = 0; i < n - k; i++) {
			System.out.print(" ");
		}
		for (int i = 0; i < 2 * k - 1; i++) {
			System.out.print(i + 1);
		}
		System.out.println();
		if (n > k) {
			pyramidPattern2(n, k + 1);
		}
	}

	public static void pyramidPattern3(int n, int k) {
		for (int i = 0; i < n - k; i++) {
			System.out.print(" ");
		}
		for (int i = 0; i < 2 * k - 1; i++) {
			System.out.print("*");
		}
		System.out.println();
		if (n > k) {
			pyramidPattern3(n, k + 1);
		}
	}

	public static void invertedPyramidPattern6(int n, int k) {
		for (int i = 0; i < k-1; i++) {
			System.out.print(" ");
		}
		for (int i = 0; i < 2 * (n + 1 - k) - 1; i++) {
			System.out.print("*");
		}
		System.out.println();
		if ((n + 1) > k) {
			invertedPyramidPattern6(n, k + 1);
		}
	}

	public static void invertedPyramidPattern7(int n, int k) {
		for (int i = 0; i < k-1; i++) {
			System.out.print(" ");
		}
		for (int i = 0; i < 2 * (n +1 - k) - 1; i++) {
			System.out.print(n - k+1);
		}
		System.out.println();
		if (n > k) {
			invertedPyramidPattern7(n, k + 1);
		}
	}
	
	
	


	public static void main(String[] args) {
		drawpyramid(5);
	}
}
