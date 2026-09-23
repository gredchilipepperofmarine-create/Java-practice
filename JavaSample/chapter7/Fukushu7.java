public class Fukushu7 {
  public static void main (String[] args) {
    int[][] matrix = {{11,12,13},{21,22,23}};
    for (int[] row: matrix){
      for(int col: row){
        System.out.print(col+" ");
      }
      System.out.println();
    }
  }
  
}
