public class MDArray2 {
  public static void main (String[] args) {
    int[][] matrix = new int[2][3];
    for(int[] row: matrix){
      for(int col: row){
        System.out.print(col+" ");
      }
      System.out.println();
    }
  }
  
}
