public class JaggedArray2 {
  public static void main (String[] args) {
    int[][] table = new int [9][9];

    for(int i = 1; i < table.length; i++){
      for(int j = 1; j < table[i].length; j++){
        table[i][j] = (i+1)*(j+1);
      }
    }

    for(int[] row: table){
      for(int col: row){
        System.out.print(col+" ");
      }
      System.out.println();
    }
  }
  
}
