package ctdl;

public class Fibonacci {
	// get the nth value of the Fibonacci series
	public static int getFibonacci(int n) {
		// TODO
		if (n == 0)
			return 0;
		if (n <= 2)
			return 1;
		return getFibonacci(n - 1) + getFibonacci(n - 2);
	}

	// This method is used to display a Fibonaccci series based on
//	the parameter n. Ex. n=10 ==> 0 1 1 2 3 5 8 13 21 34
	public static void printFibonacci(int n) {
		for (int i = 0; i <=n; i++) {
			System.out.print(getFibonacci(i)+" ");
		}

	}

	public static void main(String[] args) {
		printFibonacci(9);
	}

}
