package ctdl;

public class MoveTower {
	public static void moveTower(int n, char start, char end, char temp) {
		if(n>0){
			moveTower(n-1, start, temp, end);
			System.out.println("Move disk from "+start +" " + end );
			moveTower(n-1, temp, end, start);
		}
	}
	public static void main(String[] args) {
		char startDisk = 'A';
		char tempDisk = 'B';
		char endDisk = 'C';
		int totalDisk = 3;
		moveTower(totalDisk, startDisk, endDisk, tempDisk);
	}

}
