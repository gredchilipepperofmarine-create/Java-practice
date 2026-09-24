public class JaggedArray2 {
	public static void main(String[] args) {
		int[][] table=new int[9][9];
		for (int i=0; i<9; i++) {
			for (int j=0; j<9; j++) {
				table[i][j]=(i+1)*(j+1);
			}
		}
		for (int[] row: table) {
			for (int col: row) {
				System.out.printf("%2d ", col);
			}
			System.out.println();
		}
	}
}
