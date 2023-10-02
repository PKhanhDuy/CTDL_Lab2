package ctdl;

public class Task2_1 {
	
	// S(n)=1-2+3-4+…+ ((-1)^(n+1) ).n , n>0
	public static int getSn1(int n) {
		if(n ==1 ) {
			return 1;
		}else {
			return getSn1(n-1)+ (int) Math.pow(-1, n+1);
		}
	}
	
	// S(n)=1+1.2+1.2.3+…+1.2.3…n, n>0
	public static int getSn2(int n ) {
		if(n==1) {
			return 1;
		}else {
			return giaithua(n)+getSn2(n-1);
		}
	}
	
	public static int giaithua(int n) {
		if(n ==0) {
			return 1;
		}else {
			return n*giaithua(n-1);
		}
	}
	
	// S(n)=1^2+2^2+3^2+....+n^2 , n>0
	public static int getSn3(int n ) {
		if(n==1) {
			return 1;
		}else {
			return (int)Math.pow(n, 2)+ getSn3(n-1);
		}
	}
	
	// S(n)=1+1/2+1/(2.4)+1/(2.4.6)+…+1/(2.4.6.2n), n>=0
	public static double getSn4(int n ) {
		if(n==0) {
			return 1;
		}else {
			return (double) 1/tich(n)+ (double)getSn4(n-1);
		}
	}
	
	
	public static int tich(int n) {
		if(n==1) {
			return 2;
		}else {
			return n*2*tich(n-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(getSn4(3));
		System.out.println(tich(3));
	}

}
