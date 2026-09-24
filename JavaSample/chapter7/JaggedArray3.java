public class JaggedArray3 {
	public static void main(String[] args) {
		int[][] table=new int[9][];
		for (int i=0; i<9; i++) {
			table[i]=new int[i+1];
			for (int j=0; j<i+1; j++) {
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
