public class MDArray3 {
	public static void main(String[] args) {
		int[][] matrix=new int[2][3];
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				matrix[i][j]=(i+1)*10+(j+1);
			}
		}
		for (int[] row: matrix) {
			for (int col: row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}
