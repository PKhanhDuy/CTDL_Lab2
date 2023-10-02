package ctdl;

public class PascalTriangle {
	// This method is used to display a Pascal triangle based on the parameter n.
	// Where n represents the number of rows
	public static void printPascalTriangle(int row) {
		int[][] pascalTriangle = new int[row][];
		for(int i =0; i< pascalTriangle.length;i++) {
			pascalTriangle[i] = getPascalTriangle(i+1);
		}
		for (int i = 0; i < pascalTriangle.length; i++) {
			for (int j = 0; j < pascalTriangle[i].length; j++) {
				System.out.print(pascalTriangle[i][j]+ " ");
			}
			System.out.println();
		}
	
	}

	// get the nth row.
	// For example: n=1 ==> {1}, n=2 ==> {1, 1}, ...
	public static int[] getPascalTriangle(int n){
		if(n==1) {
			return new int[] {1};
		}else {		
			int[] prev = getPascalTriangle(n-1);
			return generateNextRow(prev);
		}
	}

	// generate the next row based on the previous row
	// Ex. prevRow = {1} ==> nextRow = {1, 1}
	// Ex. prevRow = {1, 1} ==> nextRow = {1, 2, 1}
	public static int[] generateNextRow(int[] prevRow) {
		int[] res = new int[prevRow.length + 1];
		for (int i = 0; i < res.length; i++) {
			if (i == 0 || i == res.length - 1) {
				res[i] = 1;
			} else {
				res[i] = prevRow[i] + prevRow[i - 1];
			}
		}
		return res;
	}

	public static void main(String[] args) {
//		int[] res = generateNextRow(new int[] { 1, 3, 3, 1 });
//		int[] res = getPascalTriangle(3);
//		
//		for (int i : res) {
//			System.out.println(i + " ");
//		}
		printPascalTriangle(6);
	}

}
